import java.io.*;
import java.util.*;

class Main {
    /**
     * 18222번, 투에-모스 문자열
     */
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
         입력이 자연수 k (1 ≤ k ≤ 10^18)
         Int 말고 Long 타입으a로 해야함.
         */
        long K = Long.parseLong(br.readLine());
        System.out.print(findChar(K));
    }

    private static char findChar(long k) {
        if(k == 1) {
            return '0';
        }

        // find
        long length = 1;
        while(length * 2 <k) {
            length *= 2; // 각 단계에서 길이가 2배씩 되니까 (AB -> ABBA 이런 식으로)
        }
        // 1 -> 2, 2 -> 4 , 4 -> 8, 8 -> 16 이런 식으로

        if (k == length + 1) {
            return '1';
        } else if (k > length) {
            return findChar(k - (length)) == '0' ? '1' : '0';
        } else return findChar(k);
    }
}
/**
 * 01 -> 01 10 -> 0110 1001 -> 01101001 10010110 -> 0110100110010110 1001011001101001
 */
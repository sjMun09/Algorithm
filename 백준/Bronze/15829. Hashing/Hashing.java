import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 15829
        // 곱셈과 덧셈의 분배법칙 이용
        final int M = 1234567891;
        int L = Integer.parseInt(br.readLine());
        String str = new String(br.readLine());
        long sum =0;
        long pw = 1;
        int r = 31;
        char[] arr = str.toCharArray();
        for (int i = 0; i < L; i++) {
            sum += (arr[i] - 'a' + 1) * pw % M;
//
            pw = pw * r % M;
        }
        long H = sum % M;
        System.out.print(H);

    }
}


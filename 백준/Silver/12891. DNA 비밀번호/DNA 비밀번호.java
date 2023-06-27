import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        int answer = 0;
        int[] alpha = new int[26];
        int[] checkCnt = new int[4];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        String dna = st.nextToken();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<4; i++) {
            checkCnt[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<P; i++) {
            int ascii = dna.charAt(i);
            int alphabet = ascii - 65;
            alpha[alphabet]++;
        }
        int index = -1;
        while(P+index < dna.length()) {
            index++;
            if(alpha[0] >= checkCnt[0] && alpha[2] >= checkCnt[1] && alpha[6] >= checkCnt[2] && alpha[19] >= checkCnt[3]) {
                answer++;
            }
            if(P+index < dna.length()) { // 인덱스 초과 에러 예방
                int start = dna.charAt(index) -65;
                alpha[start]--;
                int end = dna.charAt(P+index) -65;
                alpha[end]++;
            }
        }
        System.out.print(answer);
    }
}
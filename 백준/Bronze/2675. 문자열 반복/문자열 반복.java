import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] str = br.readLine().split(" "); // split 사용으로 공백 분리해줌
                
            // 문자열 string -> int 로 수정
            int R = Integer.parseInt(str[0]);
            String S = str[1];

            // S 배열 길이만큼 반복해서 출력
            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    // j 문자 반복 chartAt() 메서드 사용
                    System.out.print(S.charAt(j));
                }
            }
            System.out.print('\n');
        }

    }
}

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int test_case = Integer.parseInt(br.readLine()); // 테스트 케이스

        for (int i = 0; i < test_case; i++) {

            int count = 0; // 연속횟수
            int sum = 0; // 누적 합산

            for (byte value : br.readLine().getBytes()) {

                if (value == 'O') {
                    count++;
                    sum += count;
                }
                else {
                    count = 0;
                }
            }

            sb.append(sum).append('\n');

        }
        System.out.println(sb);


    }
}

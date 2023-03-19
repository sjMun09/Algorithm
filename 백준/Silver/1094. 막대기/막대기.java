import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());

        int stick = 64;
        int count = 0;

        while (x > 0) {
            //스틱의 길이가 x보다 크다면 절반 커팅
            if (stick > x) {
                stick /= 2;
            } else {
                // 스틱의 길이가 x보다 작으면 풀로 붙이기
                count++;
                x -= stick;
            }
        }
        System.out.print(count);
    }
}


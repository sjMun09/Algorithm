import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());

        // N을 F로
        int num1 = N % 100; // 맨 뒤 두 수
        int num2 = N - num1; // 맨 뒤 두 수를 뺀 N 값

        // 나누어 떨어지는 수 찾기,
        // N이 F로 나누어떨어질 때까지 반복
        while ((num2 % F) != 0) {
            num2++;
        }
        int index = num2 % 100; // 최종적으로 맨 뒤 두 수
        if (index > 9) {
            System.out.println(index);
        } else {
            // 맨 뒤의 두 수가 일의 자리 수라면 0을 붙여서 출력
            System.out.print('0');
            System.out.print(index);
        }

    }
}


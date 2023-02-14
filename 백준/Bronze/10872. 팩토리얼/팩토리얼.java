import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

// 재귀 알고리즘

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        br.close();

        int sum = factorial(T);
        System.out.println(sum);


    }

    private static int factorial(int T) {
        if (T < 2) {
            return 1; // 재귀 종료 조건}
        }
            return T * factorial(T - 1);
        }
}

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 아래 꼬깔콘
        for (int i = 0; i < n; i++) {
            // n 행까지만 공백 출력
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
//          별 찍기
            for (int k = 0; k < (2 * n - 1)-(i*2); k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        // 위 꼬깔콘
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < (n-2)-i; j++) {
                System.out.print(" ");
            }
//            별찍기
            for (int k = 0; k <= 2*i +2; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}

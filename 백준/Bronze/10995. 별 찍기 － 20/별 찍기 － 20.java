import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
//           홀수행일 경우 홀수 출력들은 별, 그리고 짝수 출력들은 공백
            if (i % 2 == 1) {
                for (int j = 0; j < 2 * n; j++) {
                    if (j % 2 == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else {  // 짝수 행에서도 마찬가지로 N개의 출력을 하게 되는데 홀수 출력들은 공백, 그리고 짝수 출력들은 별을 출력
                for (int j = 0; j < 2 * n; j++) {
                    if (j % 2 == 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}

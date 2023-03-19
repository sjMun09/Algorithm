import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // 행렬을 짝수와 홀수로 나누는 로직
        for (int i = 1; i <= N * 2; i++) {
            //홀수행 짝수행 나눠주기
            if (i % 2 != 0) {
                //열 반복
                for (int j = 1; j <= N; j++) {
                    // 홀수열과 짝수열을 나눠줌
                    if (j % 2 != 0) {
                        System.out.print("*");
                    }else
                        System.out.print(" ");

                }
            }
            else {
                for (int j = 1; j <= N; j++) {
                    if (j % 2 != 0) {
                        System.out.print(" ");
                    }else
                        System.out.print("*");

                }
            }
            System.out.println();
        }
    }
}


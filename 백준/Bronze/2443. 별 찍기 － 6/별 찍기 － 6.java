import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 행
        for (int i = 0; i < n; i++) {
//            여백
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
//          열
            for (int k = 0; k < (2 * n - 1) - 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

import java.util.*;
import java.io.*;

/**
 * 2024.12.17
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());

        //(N의 최대값이 100이므로 미리 계산)
        long[] p = new long[101];
        p[1] = 1;
        p[2] = 1;
        p[3] = 1;
        for (int i = 4; i <= 100; i++) {
            p[i] = p[i-2] + p[i-3];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            sb.append(p[N]).append("\n");
        }

        System.out.print(sb);
    }
}
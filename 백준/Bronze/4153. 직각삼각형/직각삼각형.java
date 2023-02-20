import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            if (A == 0 && B == 0 && C == 0) break;

            if ((A * A) + (B * B) == (C * C)) {
                System.out.println("right");
            } else if (((A * A) + C * C) == B * B) {
                System.out.println("right");
            } else if (((B * B) + C * C) == A * A) {
                System.out.println("right");
            } else System.out.println("wrong");
        }
    }
}

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int d = gcd(a, b); 

            System.out.print(a * b / d + " " + d+"\n");
        }
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b; 

            a = b;
            b = r;
        }
        return a;
    }
}

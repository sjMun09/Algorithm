import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 최대 공약수
        int d = gcd(a, b);

        System.out.println(d);
        System.out.println(a * b / d);
    }
        public static int gcd(int a, int b) {
            if (b == 0)
                return a;

            // GCD(a, b) = GCD(b, r)이므로 (r = a % b)
            return gcd(b, a % b);

    }
}


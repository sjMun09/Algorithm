import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static final long MOD = 1_000_000_007;

    static long f(long n, long r) {
        long index = 1;
        for (; r > 0; r >>= 1) {
            if (r % 2 > 0) index= index * n % MOD;
            n = n * n % MOD;
        }
        return index;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        long a = 1, b = 1;
        for (int i = 0; i <= k; ++i) {
            a = a * (n + i) % MOD;
            b = b * (i + 1) % MOD;
        }

        System.out.println(a * f(b, MOD - 2) % MOD);
    }
}
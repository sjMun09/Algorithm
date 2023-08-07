import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static final int MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] c = new int[K];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());
            c[a % K]++;
        }

        long ans = 1;
        for (int i = 1; i < (K + 1) / 2; i++) {
            long pi = powMod(2, c[i], MOD);
            long pj = powMod(2, c[K - i], MOD);
            ans = (ans * (pi + pj - 1)) % MOD;
        }
        ans = (ans * (c[0] + 1)) % MOD;

        if (K % 2 == 0) {
            ans = (ans * (c[K / 2] + 1)) % MOD;
        }

        ans = (ans + MOD - (N + 1)) % MOD;
        System.out.println(ans);
    }

    private static long powMod(long base, int exponent, int mod) {
        long result = 1;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exponent >>= 1;
        }
        return result;
    }
}

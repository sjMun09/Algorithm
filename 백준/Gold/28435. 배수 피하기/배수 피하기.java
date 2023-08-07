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
            long pi = 1, pj = 1;
            for (int k = 0; k < c[i]; k++) {
                pi = pi * 2 % MOD;
            }
            for (int k = 0; k < c[K - i]; k++) {
                pj = pj * 2 % MOD;
            }
            ans = (ans * (pi + pj - 1)) % MOD;
        }
        ans = (ans * (c[0] + 1)) % MOD;

        if (K % 2 == 0) {
            ans = (ans * (c[K / 2] + 1)) % MOD;
        }

        ans = (ans + MOD - (N + 1)) % MOD;
        System.out.println(ans);
    }
}
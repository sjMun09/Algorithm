import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        br.close();

        BigInteger[] dp = new BigInteger[n + 1];

        if (n >= 1) {
            dp[1] = BigInteger.ONE;
        }
        if (n >= 2) {
            dp[2] = BigInteger.ONE;
        }

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1].add(dp[i - 2]);
        }

        bw.write(dp[n].toString());
        bw.flush();
        bw.close();
    }
}
import java.io.*;

public class Main {
    public static final int MAX = 1000;

    static int C, N;
    static int[] dp = new int[MAX + 1];
    static boolean[][] visited = new boolean[MAX + 1][MAX + 1];

    public static int GCD(int x, int y) {
        if (y == 0) return x;
        return GCD(y, x % y);
    }

    public static void MakeDP(int curr) {
        if (curr > MAX) return;
        int ADD = 0;
        for (int i = 1; i < curr; ++i) {
            int x = i;
            int y = curr;
            int g = GCD(y, x);
            x /= g;
            y /= g;
            if (visited[y][x]) continue;
            ADD++;
            visited[y][x] = true;
        }
        dp[curr] = dp[curr - 1] + 2 * ADD;
        MakeDP(curr + 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        C = Integer.parseInt(br.readLine());
        dp[1] = 3;
        visited[1][1] = true;
        MakeDP(2);

        while (C-- > 0) {
            N = Integer.parseInt(br.readLine());
            sb.append(dp[N]).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
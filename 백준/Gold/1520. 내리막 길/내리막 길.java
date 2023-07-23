import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static int[][] adjacent;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int n, m;
    static int[][] memo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        adjacent = new int[n][m];
        memo = new int[n][m];
        // memoization 초기화
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                memo[i][j] = -1;
            }
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                adjacent[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(dfs(0, 0));
    }

    static int dfs(int x, int y) {
        // base case
        if (x == n - 1 && y == m - 1) {
            return 1;
        }

        // 이미 방문하여 경우의 수를 세었다면 저장된 값을 사용
        if (memo[x][y] != -1) {
            return memo[x][y];
        }

        memo[x][y] = 0;
        for (int i = 0; i < 4; i++) {
            int xx = x + dx[i];
            int yy = y + dy[i];

            if (xx >= 0 && xx < n && yy >= 0 && yy < m) {
                if (adjacent[xx][yy] < adjacent[x][y]) {
                    memo[x][y] += dfs(xx, yy);
                }
            }
        }
        return memo[x][y];
    }
}

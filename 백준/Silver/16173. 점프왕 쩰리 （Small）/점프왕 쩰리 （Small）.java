import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);

        System.out.println(visited[N - 1][N - 1] ? "HaruHaru" : "Hing");
    }

    public static void dfs(int x, int y) {
        if (visited[x][y]) {
            return;
        }

        visited[x][y] = true;
        int nextJump = map[x][y];

        if (nextJump == 0) {
            return;
        }

        int[] dx = {nextJump, 0};
        int[] dy = {0, nextJump};

        for (int i = 0; i < 2; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                dfs(nx, ny);
            }
        }
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static char[][] tiles;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        tiles = new char[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < M; j++) {
                tiles[i][j] = input.charAt(j);
            }
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j]) {
                    dfs(i, j, tiles[i][j]);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void dfs(int x, int y, char type) {
        if (x < 0 || y < 0 || x >= N || y >= M || visited[x][y] || tiles[x][y] != type) {
            return;
        }

        visited[x][y] = true;
        if (type == '-') {
            dfs(x, y - 1, type);
            dfs(x, y + 1, type);
        } else { // type == '|'
            dfs(x - 1, y, type);
            dfs(x + 1, y, type);
        }
    }
}

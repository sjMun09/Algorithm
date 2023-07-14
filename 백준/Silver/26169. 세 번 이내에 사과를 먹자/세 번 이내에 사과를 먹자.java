import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static final int SIZE = 5;
    private static final int LIMIT = 3;
    private static final int APPLE = 1;
    private static final int BLOCK = -1;
    private static final int EMPTY = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] map = new int[SIZE][SIZE];
        for(int i = 0 ; i < SIZE ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < SIZE ; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        boolean[][] visited = new boolean[SIZE][SIZE];
        int result = dfs(0, y, x, map, 0, visited);
        System.out.println(result);
    }
    private static final int[] DY = {-1, 0, 1, 0};
    private static final int[] DX = {0, 1, 0, -1};
    private static int dfs(int depth, int y, int x, int[][] map, int cnt, boolean[][] visited) {
        visited[y][x] = true;
        if (map[y][x] == APPLE) {
            cnt++;
        }
        if (cnt >= 2) {
            return 1;
        }
        if (depth >= LIMIT) {
            visited[y][x] = false;
            return 0;
        }
        for (int i = 0; i < 4; i++) {
            int ny = y + DY[i];
            int nx = x + DX[i];
            if (ny >= 0 && ny < SIZE && nx >= 0 && nx < SIZE && !visited[ny][nx] && map[ny][nx] != BLOCK) {
                if (dfs(depth + 1, ny, nx, map, cnt, visited) == 1) {
                    return 1;
                }
            }
        }
        visited[y][x] = false;
        return 0;
    }
}

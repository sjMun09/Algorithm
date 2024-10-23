import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    
    // 말의 이동 (나이트처럼 이동)
    static int[] horse_dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] horse_dy = {1, 2, 2, 1, -1, -2, -2, -1};
    
    static int W, H, K;
    static int[][] map;
    static boolean[][][] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        K = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        W = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        
        map = new int[H][W];
        for (int i = 0; i < H; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < W; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visited = new boolean[H][W][K + 1];

        int result = bfs();
        System.out.print(result);
    }

    static int bfs() {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 0, 0}); 
        visited[0][0][0] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int horseMoves = current[2];  
            int moves = current[3];  

            if (x == H - 1 && y == W - 1) {
                return moves;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (isInBounds(nx, ny) && !visited[nx][ny][horseMoves] && map[nx][ny] == 0) {
                    visited[nx][ny][horseMoves] = true;
                    queue.add(new int[]{nx, ny, horseMoves, moves + 1});
                }
            }

            if (horseMoves < K) {
                for (int i = 0; i < 8; i++) {
                    int nx = x + horse_dx[i];
                    int ny = y + horse_dy[i];

                    if (isInBounds(nx, ny) && !visited[nx][ny][horseMoves + 1] && map[nx][ny] == 0) {
                        visited[nx][ny][horseMoves + 1] = true;
                        queue.add(new int[]{nx, ny, horseMoves + 1, moves + 1});
                    }
                }
            }
        }

        return -1;
    }

    static boolean isInBounds(int x, int y) {
        return x >= 0 && x < H && y >= 0 && y < W;
    }
}

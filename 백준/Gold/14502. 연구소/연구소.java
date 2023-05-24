import java.io.*;
import java.util.*;

public class Main {
    static int N, M, maxSafeArea = 0;
    static int[][] map, tempMap;
    
    // Quadrant 4 Direction
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        // input
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        
        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        // Wall create 3 (벽 3개 지음)
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0) {
                    // buildWall \ counting
                    map[i][j] = 1;
                    buildWall(1);
                    // Wall reset
                    map[i][j] = 0;
                }
            }
        }
        
        // result, print
        System.out.print(maxSafeArea);
    }
    
    // buildWall(재귀 호출이라고 보면됨.)
    public static void buildWall(int cnt) {
        if (cnt == 3) {
            
            // instance spread virus
            Virus v = new Virus();
            v.spread(map);
            maxSafeArea = Math.max(maxSafeArea, v.findSafeArea());
            return;
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0) {
                    // buildWall
                    map[i][j] = 1;
                    buildWall(cnt + 1);
                    // wall reset
                    map[i][j] = 0;
                }
            }
        }
    }
}


// virus class 
class Virus {
    int N = Main.N;
    int M = Main.M;
    int[] dx = Main.dx;
    int[] dy = Main.dy;
    
    // spread virus
    public void spread(int[][] map) {
        int[][] tempMap = new int[N][M];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                tempMap[i][j] = map[i][j];
            }
        }
        
        Queue<int[]> queue = new LinkedList<>(); 
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (tempMap[i][j] == 2) {
                    queue.add(new int[]{i, j});
                }
            }
        }
        
        while (!queue.isEmpty()) {
            int[] pos = queue.poll(); 
            for (int i = 0; i < 4; i++) {
                int nx = pos[0] + dx[i];
                int ny = pos[1] + dy[i];
                
                if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    if (tempMap[nx][ny] == 0) {
                        tempMap[nx][ny] = 2;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
        
        Main.tempMap = tempMap;
    }
    
    // safeArea search
    public int findSafeArea() {
        int safeArea = 0;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (Main.tempMap[i][j] == 0) {
                    safeArea++;
                }
            }
        }
        
        return safeArea;
    }
}

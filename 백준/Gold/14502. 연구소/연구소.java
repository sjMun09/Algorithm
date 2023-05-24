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
                    // Wall Counting (벽 세우기)
                    map[i][j] = 1;
                    buildWall(1);
                    
                    /*
                    벽을 3개 세우는 과정을 구현하기 위해 사용함. 
                    예시를 보면, 처음에 서로 다른 3개의 빈 칸에 벽을 세우는 모든 경우의 수를 확인해야 하므로,
                    재귀 호출을 사용하여, 벽을 한 개씩 세워본 후 남은 벽을 모두 세운 경우 바이러스를 퍼뜨려본 다음 안전 구역의 크기를 구합니다.
                    해당 코드에서, buildWall(1)은 두 가지 의미가 있습니다.
                    1. 첫 번째 벽을 세운 상태에서 호출하였다.
                    2. 현재까지 1개의 벽을 세웠다.
                    
                    다시말해,벽을 세우는 과정에서 재귀 함수를 호출할 때마다, cnt(현재까지 세운 벽의 개수)를 1씩 증가시킵니다. 
                    모든 벽을 다 세웠다는 것은 cnt가 3이라는 뜻이며,
                    이 경우에 바이러스를 퍼뜨리는 작업을 진행합니다.
                    결론적으로, 즉, 이 코드는 벽을 세우는 재귀 함수의 시작점으로, 처음 벽을 세운 후 남은 벽들을 세우기 위해 재귀 함수를 호출하는 코드입니다. 
                    이를 통해 가능한 모든 위치에 벽을 설치한 후, 안전한 영역의 최대 크기를 찾을 수 있습니다.
                    */
                    
                    // Wall reset
                    map[i][j] = 0;
                }
            }
        }
        
        // result, print
        System.out.print(maxSafeArea);
    }
    
    // Wall Counting (벽 세우기 (재귀 호출이라고 보면됨.))
    public static void buildWall(int cnt) {
        if (cnt == 3) {
            
            // instance 바이러스 퍼뜨리기
            Virus v = new Virus();
            v.spread(map);
            maxSafeArea = Math.max(maxSafeArea, v.findSafeArea());
            return;
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0) {
                    // 벽 세우기
                    map[i][j] = 1;
                    buildWall(cnt + 1);
                    // 벽 초기화
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
    
    // 바이러스 확산
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
            int[] pos = queue.poll(); // 이건 자바 큐에서, 값 제거할 때 씀.
            /*
            여기서, remove()를 사용해도 되지만, 큐가 비어있는 경우 NoSuchElementException ERR
            따라서, que가 비어있을 경우, null을 반환해주는 poll() use.
            clear()은 큐 비우는 용도로 사용함.
            */
            
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
    
    // 안전 영역 찾기
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

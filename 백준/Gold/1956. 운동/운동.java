import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
        (input)
        V 개의 마을, E 개의 도로
        마을-도로-마을-도로-마을 (마을은 V 번까지 번호 매김)
        운동 끝낸 후, 시작점으로 돌아와야 함. (최단거리 알고리즘)
        일방통행 도로. 운동 경로 찾는 것이 불가능 하면 '-1'
        a번 에서 b 번마을까지 거리가 c 인 도로 (입력 값)
        (output)
        최소 사이클의 도로 길이의 합
        */
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        int INF = 100000000;

        int[][] dist = new int[V + 1][V + 1];

        for (int i = 1; i <= V; i++) {
            Arrays.fill(dist[i], INF);
            // 자기 자신으로 가는 길은 최소 비용 0
            // dist[i][i] = 0;
        }

        // input
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            dist[a][b] = c;
        }

        for (int k = 1; k <= V; k++) {
            for (int i = 1; i <= V; i++) {
                for (int j = 1; j <= V; j++) {
                    // dist[i][k] != INF && dist[k][j] != INF 조건을 추가하지 않는다면, 경로가 유효하지 않은 경우에도 dist[i][j] 값 갱신 가능성 있음
                    if (dist[i][k] != INF && dist[k][j] != INF && dist[i][j] > dist[i][k] + dist[k][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }
        int minCycle = INF;
        for (int i = 1; i <= V; i++) {
            minCycle = Math.min(minCycle, dist[i][i]);
        }
        System.out.print(minCycle == INF ? -1 : minCycle);
    }
}

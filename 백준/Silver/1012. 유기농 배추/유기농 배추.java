import java.io.*;
import java.util.*;


class Main {
    /**
     * 좌표
     */
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int[][] field;
    static boolean[][] visit;
    static int M,N,K;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /**
         * 1012번, dfs 배추심기.
         */
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            M = Integer.parseInt(st.nextToken()); // width
            N = Integer.parseInt(st.nextToken()); // height
            K = Integer.parseInt(st.nextToken()); //count

            field = new int[N][M];
            visit = new boolean[N][M];

            //input
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                field[y][x] =1; // 1은 배추가 심어져 있는 땅을 나타낸다.
            }

            // cnt++;
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (field[i][j] == 1 && !visit[i][j]) {
                        dfs(i,j);
                        cnt++;
                    }
                }
            }
            sb.append(cnt).append("\n"); // record
        }
        System.out.print(sb.toString());
    }

    /**
     * dfs
     */
    static void dfs(int y, int x) {
        visit[y][x] = true;

        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i]; // y
            int nx = x + dx[i]; // x

            // checking // RECURSIVE
            if(ny>=0 && ny<N && nx>=0 && nx<M && field[ny][nx]==1 && !visit[ny][nx]) dfs(ny, nx);
        }
    }
}
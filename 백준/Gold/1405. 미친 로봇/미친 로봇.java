import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static double result;
    static double[] percent = new double[4];
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static boolean[][] visited = new boolean[30][30];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());

        for(int i = 0; i < 4; i++) {
            percent[i] = Integer.parseInt(st.nextToken()) * 0.01;
        }

        visited[15][15] = true;
        DFS(15, 15, 0, 1.0);
        System.out.println(result);
    }

    public static void DFS(int x, int y, int depth, double p) {
        if(depth == N) {
            result += p;
            return;
        }

        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(!visited[nx][ny]) {
                visited[nx][ny] = true;
                DFS(nx, ny, depth + 1, p * percent[i]);
                visited[nx][ny] = false;
            }
        }
    }
}

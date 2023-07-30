import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
class Main {

    static int n, m, x, y;
    static int[][] map;
    static boolean[] visited;
    static int result = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(br.readLine());

        map = new int[n+1][n+1];
        visited = new boolean[n+1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int p1 = Integer.parseInt(st.nextToken());
            int p2 = Integer.parseInt(st.nextToken());
            map[p1][p2] = map[p2][p1] = 1;
        }

        dfs(x, y, 0);
        System.out.print(result);
    }

     static void dfs(int start, int end, int count) {
        if (start == end) {
            result = count;
            return;
        }

        visited[start] = true;

        for (int i = 0; i <= n; i++) {
            if (map[start][i] == 1 && !visited[i]) {
                dfs(i, end, count + 1);
            }
        }
    }
}

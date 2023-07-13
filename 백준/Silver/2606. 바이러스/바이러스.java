import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    private static ArrayList<ArrayList<Integer>> adjacentList;
    private static boolean[] visited;
    private static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        // 컴퓨터들의 연결 정보
        adjacentList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adjacentList.add(new ArrayList<>());
        }

        visited = new boolean[n + 1]; // 방문 여부 체크
        count = 0; // 1번 컴퓨터와 바이러스에 감염된 컴퓨터 개수를 저장

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            adjacentList.get(a).add(b);
            adjacentList.get(b).add(a);
        }

        dfs(1);
        System.out.println(count);
    }

    private static void dfs(int start) {
        if (visited[start]) {
            return;
        }

        visited[start] = true;

        for (Integer i : adjacentList.get(start)) {
            if (!visited[i]) {
                count++;
                dfs(i);
            }
        }
    }
}

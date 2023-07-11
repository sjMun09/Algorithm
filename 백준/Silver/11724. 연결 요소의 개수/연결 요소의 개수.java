import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main{
    static ArrayList<Integer>[] arr;
    static boolean[] visited;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        for (int i = 1; i < N + 1; i++) {
            arr[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            arr[u].add(v);
            arr[v].add(u);
        }
        for (int i = 1; i < N + 1; i++) {
            if (!visited[i]) {
                count++;
                DFS(i);
            }
        }
        System.out.print(count);
    }

    static void DFS(int node) {
        if (visited[node]) {
            return;
        }
        visited[node] = true;
        for (int i : arr[node]) {
            if (visited[i] == false) {
                DFS(i);
            }
        }
    }
}
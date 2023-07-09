import java.io.*;
import java.util.*;

public class Main {
    static int[] time;
    static ArrayList<Integer>[] order;
    static int[] inDegree;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int testCase = 0; testCase < T; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            time = new int[N + 1];
            order = new ArrayList[N + 1];
            inDegree = new int[N + 1];

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                time[i] = Integer.parseInt(st.nextToken());
                order[i] = new ArrayList<>();
            }

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());
                order[X].add(Y);
                inDegree[Y]++;
            }

            int W = Integer.parseInt(br.readLine());
            System.out.println(bfs(W));
        }
    }

    public static int bfs(int W) {
        int[] result = Arrays.copyOf(time, N + 1);
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int next : order[current]) {
                result[next] = Math.max(result[next], result[current] + time[next]);
                inDegree[next]--;

                if (inDegree[next] == 0) {
                    queue.add(next);
                }
            }
        }

        return result[W];
    }
}
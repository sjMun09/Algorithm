import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static class Edge {
        int start, end, value;

        Edge(int start, int end, int value) {
            this.start = start;
            this.end = end;
            this.value = value;
        }
    }

    static int N, M;
    static ArrayList<Edge> edges;
    static long[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        edges = new ArrayList<>();
        dist = new long[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());

            edges.add(new Edge(start, end, value));
        }

        boolean hasNegativeCycle = bellmanFord();

        if (hasNegativeCycle) {
            System.out.println("-1");
        } else {
            for (int i = 2; i <= N; i++) {
                System.out.println((dist[i] == Integer.MAX_VALUE) ? "-1" : dist[i]);
            }
        }
    }

    static boolean bellmanFord() {
        boolean hasNegativeCycle = false;

        for (int i = 1; i <= N; i++) {
            boolean updated = false;

            for (Edge edge : edges) {
                int start = edge.start;
                int end = edge.end;
                int value = edge.value;

                if (dist[start] != Integer.MAX_VALUE && dist[end] > dist[start] + value) {
                    dist[end] = dist[start] + value;
                    updated = true;

                    if (i == N) {
                        hasNegativeCycle = true;
                    }
                }
            }

            if (!updated) {
                break;
            }
        }

        return hasNegativeCycle;
    }
}

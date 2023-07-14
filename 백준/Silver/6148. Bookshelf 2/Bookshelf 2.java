import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static int n, b;
    static int[] cows;
    static int minHeightDiff = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        n = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        cows = new int[n];

        for (int i = 0; i < n; i++) {
            cows[i] = Integer.parseInt(br.readLine().trim());
        }

        dfs(0, 0);

        System.out.print(minHeightDiff);
    }

    public static void dfs(int index, int height) {
        if (index == n) {
            if (height >= b) {
                minHeightDiff = Math.min(minHeightDiff, height - b);
            }
            return;
        }
        // 삽입. 즉 포함.
        dfs(index + 1, height + cows[index]);
        // exclude라고 보면됨.
        dfs(index + 1, height);
    }
}

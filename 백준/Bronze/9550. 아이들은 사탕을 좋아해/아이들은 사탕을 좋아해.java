import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(stk.nextToken());
            int K = Integer.parseInt(stk.nextToken());

            int[] candies = new int[N];
            stk = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                candies[j] = Integer.parseInt(stk.nextToken());
            }

            int totalChildren = 0;
            for (int candy : candies) {
                totalChildren += candy / K;
            }

            System.out.println(totalChildren);
        }
    }
}

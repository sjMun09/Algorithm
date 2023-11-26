import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] cost = new int[4];
        cost[1] = Integer.parseInt(st.nextToken());
        cost[2] = Integer.parseInt(st.nextToken()) * 2;
        cost[3] = Integer.parseInt(st.nextToken()) * 3;

        int[] time = new int[101];
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int arrive = Integer.parseInt(st.nextToken());
            int leave = Integer.parseInt(st.nextToken());

            for (int j = arrive; j < leave; j++) {
                time[j]++;
            }
        }

        int totalCost = 0;
        for (int i = 0; i < 101; i++) {
            totalCost += cost[time[i]];
        }

        System.out.println(totalCost);
    }
}

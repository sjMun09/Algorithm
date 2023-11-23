import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        int minCost = Integer.MAX_VALUE;

        for(int i=0; i<=100000; i++) {
            int cost = 2 * i * C;
            if(X > i) cost += (X - i) * A;
            if(Y > i) cost += (Y - i) * B;

            minCost = Math.min(minCost, cost);
        }

        System.out.print(minCost);
    }
}
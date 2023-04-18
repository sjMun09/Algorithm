import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        int M = Integer.parseInt(st.nextToken());
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int F = Integer.parseInt(st.nextToken()); // F번 바구니부터
            int E = Integer.parseInt(st.nextToken()); // E번 바구니까지
            int ball = Integer.parseInt(st.nextToken()); // ball번 공을 넣는다

            for(int j = F-1; j<E; j++)
            {
                arr[j] = ball;
            }
        }
        br.close();
        for (int baguni : arr)
            System.out.print(baguni + " ");
    }
}
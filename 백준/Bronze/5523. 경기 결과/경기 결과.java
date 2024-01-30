import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];
        int winA = 0;
        int winB = 0;

        for(int i = 0; i < N; i++) {
            String[] scores = br.readLine().split(" ");
            A[i] = Integer.parseInt(scores[0]);
            B[i] = Integer.parseInt(scores[1]);

            if(A[i] > B[i]) {
                winA++;
            } else if(A[i] < B[i]) {
                winB++;
            }
        }

        System.out.println(winA + " " + winB);
    }
}

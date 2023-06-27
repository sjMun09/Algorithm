import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        // Two Pointers
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] S = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // input
        for (int i = 0; i < N; i++) {
            S[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(S);
        int start = 0, end = N - 1, count = 0;
        while (start<end) {
            if (S[start] + S[end] < M) {
                start++;
            } else if (S[start] + S[end] > M) {
                end--;
            } else {
                count++;
                start++;
                end--;
            }
        }
        System.out.print(count);
    }
}
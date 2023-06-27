import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        // Two Pointers
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] S = new int[N]; // start 를 인덱스 1로 시작할 경우 else if 인덱스 0일경우엔 [N]으로 초기화해줌.
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            S[i] = Integer.parseInt(st.nextToken());
        }
        // Arrays.sort(S); 정렬하게 된다면, 연속된 기간의 합을 찾지 못함. 따라서 그냥 해야함.
        int Max = Integer.MIN_VALUE, sum = 0, start = 0, end = 0;
        while (end < N) {
            sum += S[end++];
            if (end - start == K) {
                Max = Math.max(Max, sum);
                sum -= S[start++];
            }
        }
        System.out.print(Max);
    }
}
import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        // input
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        /**
         * 내가 알기론, 에라토스테네스 체? 그거 있고, 직접 구현하는 것이 있는 것으로 앎.
         * 흠, 뭐로 구하지... Prime C로 배웠던 개념을 적용해서 해볼까 ?
         * 루트를 활용한다면 ? -> 소수니까 쌉 가능.
         */
        // solV
        StringBuilder sb = new StringBuilder();
        boolean[] isPrime = new boolean[N + 1];
        Arrays.fill(isPrime, true); // 첫 수는 무조건 소수
        isPrime[0] = isPrime[1] = false; // 0과 1은 소수가 아니니까 별도 처리
        // 에토체
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if(isPrime[i])
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false; // i의 배수
            }
        }

        for (int i = M; i <= N; i++) {
            if (isPrime[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.print(sb);
    }
}
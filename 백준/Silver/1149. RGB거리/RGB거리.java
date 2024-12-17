import java.io.*;
import java.util.*;

/**
 * 2024.12.17
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] cost = new int[N][3];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            cost[i][0] = Integer.parseInt(st.nextToken()); // 빨
            cost[i][1] = Integer.parseInt(st.nextToken()); // 초
            cost[i][2] = Integer.parseInt(st.nextToken()); // 파
        }

        // 현재 비용을 누적 저장
        int[][] dp = new int[N][3];

        // 첫 번째 집의 비용 초기화
        dp[0][0] = cost[0][0]; // 빨강으로 칠했을 때
        dp[0][1] = cost[0][1]; // 초록으로 칠했을 때
        dp[0][2] = cost[0][2]; // 파랑으로 칠했을 때

        // 두 번째 집부터 N번째 집까지의 최소 비용 계산
        for (int i = 1; i < N; i++) {
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + cost[i][0]; // 이전 집이 초록 또는 파랑으로 칠해진 경우 중 최소 비용
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + cost[i][1]; // 이전 집이 빨강 또는 파랑으로 칠해진 경우
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + cost[i][2]; // 이전 집이 빨강 또는 초록으로 칠해진 경우
        }

        // 마지막 집 최소 비용
        int result = Math.min(dp[N-1][0], Math.min(dp[N-1][1], dp[N-1][2]));
        System.out.println(result);
    }
}

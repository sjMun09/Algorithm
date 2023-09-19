import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int floor = Integer.parseInt(br.readLine());
        int[] steps = new int[floor+1];
        for(int i=1; i<=floor; i++) {
            steps[i] = Integer.parseInt(br.readLine());
        }

        // dp 배열 초기화
        int[] dp = new int[floor+1];
        dp[1] = steps[1];

        if(floor >= 2) {
            dp[2] = steps[1] + steps[2];
            for(int i=3; i<=floor; i++) {
                // 현재 계단에서 전전계단으로 바로 올라올 경우와
                // 전계단에서 올라오되 그 전계단은 전전전계단에서 올라옴을 고려한 경우 중 큰 값을 선택한다.
                dp[i] = Math.max(dp[i-2] + steps[i], dp[i-3] + steps[i-1] + steps[i]);
            }
        }

        System.out.print(dp[floor]);
    }
}

/*
=================조건================================
1. 마지막 계단을 꼭 밟아야함
2. 3계단이 연속되면 안됨 -> 2계단까진 연속 가능
3. 이동은 1칸 || 2칸
4. 각 계단에는 점수가 세팅되어있음
5. 이 게임에서 얻을 수 있는 점수의 최댓값을 구해야함
=================해결================================
--> 즉, 조건 3에 의거하여 점수 더 높은 것을 체킹 후 이동.
--> 1칸 이동시, 2칸 이동시, 연속 2칸이동시,
    2칸 이동하고 연속 2칸 이동시 체킹 하는 메모리제이션 만들기.
--> 즉, 그리디 알고리즘으로 구현 가능.
--> 이것을 dp로 치환한다면 ?
==============시간 복잡도==============================
10000 x 300x N = nlogN
*/
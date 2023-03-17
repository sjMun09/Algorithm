import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
// 피보나치 문제, 참고로 int 기본값 0        
//이 문제는 DP(다이나믹 프로그래밍)를 이용하면 효율적으로 풀 수 있다. 우선 N을 입력받는다.
// 그리고 N의 범위가 45까지이다 보니 크기가 46인 int 형 배열 dp를 만들어주고 dp [1]은 1로 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[46];
        dp[1]=1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.print(dp[n]);
    }
}


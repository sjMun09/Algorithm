import java.util.*;
import java.io.*;

// 해당 문제는 이항계수문제이지만, 후차 이항계수를 이용하여 동적계획법 등,
// 사용하는 곳이 많음으로 꼭 숙지해야하는 문제 중 하나입니다.
public class Main{
    
    static int[][] dp;
    
    public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
		
        int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
 
		dp = new int[N + 1][K + 1];
		System.out.println(BC(N, K));
 
	}
	static int BC(int n, int k) {
        
		// 이미 풀었던 sub 문제일 경우 값을 재활용
		if (dp[n][k] > 0) {
			return dp[n][k];
		}
        
		if (k == 0 || n == k) {
			return dp[n][k] = 1;
		}
        
		return dp[n][k] = BC(n - 1, k - 1) + BC(n - 1, k);
	
    }
}
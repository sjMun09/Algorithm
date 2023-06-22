import java.util.*;
import java.io.*;

class Main{
    static int [][] dp = new int [30][30];
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
       // StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        // 1. input
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
          // sb.append(eggplant(M, N)).append("\n");
            System.out.println(eggplant(M,N));
        }
       // System.out.println(sb);
        br.close();
    }
        // 2. n 에 대해서 m 을 가지치기하기.
        // nCr ?
        // 재귀
        static int eggplant(int n, int r){
         /*   if(dp[n][r] == null)
            return dp[n][r]=1;*/
            if(dp[n][r]>0){
                return dp[n][r];
            }
            if(r==n||r==0){
                return dp[n][r]=1;
            }
            return dp[n][r]=eggplant(n - 1, r - 1) + eggplant(n - 1, r);
        }
}
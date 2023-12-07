import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); 
        int T = Integer.parseInt(st.nextToken()); 
        int C = Integer.parseInt(st.nextToken()); 
        int P = Integer.parseInt(st.nextToken()); 

        int totalHarvest = (N - 1) / T; // 수확 가능한 횟수
        int totalProfit = totalHarvest * C * P; 

        System.out.println(totalProfit);
    }
}
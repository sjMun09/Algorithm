import java.io.*;
import java.util.*;

public class Main {
    static int[][][] dp = new int[21][21][21];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            String[] inputs = br.readLine().split(" ");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
            int c = Integer.parseInt(inputs[2]);
            
            if (a == -1 && b == -1 && c == -1) break;
            
            int result = w(a, b, c);
            sb.append("w(").append(a).append(", ").append(b).append(", ").append(c).append(") = ").append(result).append("\n");
        }
        
        System.out.print(sb);
    }
    
    public static int w(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }
        
        if (a > 20 || b > 20 || c > 20) {
            return w(20, 20, 20);
        }
        
        if (dp[a][b][c] != 0) {
            return dp[a][b][c];
        }
        
        if (a < b && b < c) {
            dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
        } else {
            dp[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
        }
        
        return dp[a][b][c];
    }
}

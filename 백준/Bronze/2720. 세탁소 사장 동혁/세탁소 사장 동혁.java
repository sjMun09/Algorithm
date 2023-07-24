import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        int[] coins = {25, 10, 5, 1};
        
        for (int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());
            int[] result = new int[4];
            
            for (int j = 0; j < coins.length; j++) {
                result[j] = C / coins[j];
                C %= coins[j];
            }
            
            System.out.printf("%d %d %d %d\n", result[0], result[1], result[2], result[3]);
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int maxRange = 123456 * 2; 
        boolean[] isPrime = new boolean[maxRange + 1];
        
        for (int i = 2; i <= maxRange; i++) {
            isPrime[i] = true;
        }
        
        for (int i = 2; i * i <= maxRange; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= maxRange; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            
            int count = 0;
            for (int i = n + 1; i <= 2 * n; i++) {
                if (isPrime[i]) count++;
            }
            sb.append(count).append("\n");
        }
        

        System.out.print(sb);
    }
}

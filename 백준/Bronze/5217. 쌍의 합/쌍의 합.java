import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            int n = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder("Pairs for " + n + ": ");
            boolean isFirst = true;

            for(int j = 1; j <= n / 2; j++){
                if(n - j > j){
                    if(!isFirst) sb.append(", ");
                    sb.append(j + " " + (n - j));
                    isFirst = false;
                }
            }

            System.out.println(sb);
        }
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int count = 0;

            for (int j = n; j <= m; j++) {
                char[] numChars = String.valueOf(j).toCharArray();
                for (char numChar : numChars) {
                    if (numChar == '0') {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
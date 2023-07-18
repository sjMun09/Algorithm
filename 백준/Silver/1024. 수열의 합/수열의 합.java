import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        for (int len = L; len <= 100; len++) {
            int temp = N - len * (len + 1) / 2;
            if (temp % len == 0) {
                int start = temp / len + 1;
                if (start >= 0) {
                    for (int i = 0; i < len; i++) {
                        System.out.print(start + i + " ");
                    }
                    System.out.println();
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int test_num, a, b,c;
        int MAX = 1000000;
        boolean[] is_prime = new boolean[MAX + 1];

        // 소수 찾기 (에레스토체)
        Arrays.fill(is_prime, true);
        is_prime[0] = is_prime[1] = false;
        for (int i = 2; i * i <= MAX; i++) {
            if (is_prime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    is_prime[j] = false;
                }
            }
        }

        while (true) {
            test_num = Integer.parseInt(br.readLine());
            if (test_num == 0) break;

            for (a = 3; a <= test_num / 2; a += 2) {
                b = test_num - a;
                if (is_prime[a] && is_prime[b]) {
                    bw.write(test_num + " = " + a + " + " + b + "\n");
                    break;
                }
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}

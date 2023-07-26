import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] init_primes = {2, 3, 5, 7};
        for (int prime :init_primes) {
            dfs(n - 1, prime);
        }
    }
    public static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void dfs(int n, int num) {
        if (n == 0) {
            System.out.println(num);
            return;
        }
        for (int i = 0; i < 10; i++) {
            int temp = num * 10 + i;
            if (isPrime(temp)) {
                dfs(n - 1, temp);
            }
        }
    }
}
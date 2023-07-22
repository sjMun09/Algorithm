import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    static boolean[] primeNumber;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        etoche();

        int count = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (isPrime(num)) {
                count++;
            }
        }

        System.out.println(count);

        br.close();
    }

    private static void etoche() {
        primeNumber = new boolean[1001];
        primeNumber[0] = primeNumber[1] = true;

        for (int i = 2; i <= Math.sqrt(1000); i++) {
            if (!primeNumber[i]) {
                for (int j = i * i; j < primeNumber.length; j += i) {
                    primeNumber[j] = true;
                }
            }
        }
    }

    private static boolean isPrime(int n) {
        return !primeNumber[n];
    }
}

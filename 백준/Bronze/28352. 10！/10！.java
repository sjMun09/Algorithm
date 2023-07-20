import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long result = factorial(N) / calculateSecondsInAWeek();

        System.out.print(result);
    }

    public static long factorial(int N) {
        long result = 1;
        for (int i = 1; i <= N; i++) {
            result *= i;
        }
        return result;
    }

    public static long calculateSecondsInAWeek() {
        return 7 * 24 * 60 * 60;
    }
}
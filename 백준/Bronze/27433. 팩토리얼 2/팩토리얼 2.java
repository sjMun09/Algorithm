import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long sum = 1;
        if (N > 0) {
            for (int i = 1; i <= N; i++) {
                sum *= i;
            }
        }
        System.out.print(sum);
    }
}
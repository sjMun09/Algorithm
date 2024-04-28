import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        /*
        N의 범위가 10,000,000 까지라서 Long
         */
        long total = 5;
        if (N == 1) {
            System.out.print(total % 45678);
        } else {
            for (int i = 1; i < N; i++) {
                total = total + ((i + 2) * 3 - 2);
            }
            System.out.print(total % 45678);
        }
    }
}
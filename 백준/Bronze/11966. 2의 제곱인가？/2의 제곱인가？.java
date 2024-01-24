import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        while (N % 2 == 0 && N > 1) {
            N /= 2;
        }

        if (N == 1) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N % 2 == 0) {
            System.out.println((N / 2 + 1) * (N / 2 + 1));
        } else {
            System.out.println((N / 2 + 1) * (N / 2 + 2));
        }
    }
}

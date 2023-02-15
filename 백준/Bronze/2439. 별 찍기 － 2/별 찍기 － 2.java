import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // i 는 행을 의미한다고 보면됨.
        for (int i = 1; i <= N ; i++) {
            for (int k = 1; k <= N - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }System.out.println(" ");
        }

    }
}
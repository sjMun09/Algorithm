import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = 1;

        while (true) {
            int n0 = Integer.parseInt(br.readLine());
            if (n0 == 0) break;

            int n1 = 3 * n0;
            String isOdd = (n1 % 2 == 0) ? "even" : "odd";
            int n2 = (isOdd.equals("even")) ? n1 / 2 : (n1 + 1) / 2;
            int n3 = 3 * n2;
            int n4 = n3 / 9;

            System.out.println(testCase + ". " + isOdd + " " + n4);
            testCase++;
        }
    }
}

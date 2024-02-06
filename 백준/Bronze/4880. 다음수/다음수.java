import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while (!(input = br.readLine()).equals("0 0 0")) {
            String[] numbers = input.split(" ");
            int a1 = Integer.parseInt(numbers[0]);
            int a2 = Integer.parseInt(numbers[1]);
            int a3 = Integer.parseInt(numbers[2]);

            // 등차수열인 경우
            if (a2 - a1 == a3 - a2) {
                int commonDifference = a2 - a1;
                int nextTerm = a3 + commonDifference;
                System.out.println("AP " + nextTerm);
            } 
            // 등비수열인 경우
            else if ((a2 / a1) == (a3 / a2)) {
                int commonRatio = a2 / a1;
                int nextTerm = a3 * commonRatio;
                System.out.println("GP " + nextTerm);
            }
        }

        br.close();
    }
}

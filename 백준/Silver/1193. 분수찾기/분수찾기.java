import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        br.close();

        int count = 1;
        int sum = 0;

        while (true) {
            sum += count;
            if (X <= sum) {
                break;
            }
            count++;
        }

        int numerator;
        int denominator;

        if (count % 2 == 0) { // 짝수인 경우, 좌하향
            numerator = 1 + (sum - X);
            denominator = count - (sum - X);
        } else { // 홀수인 경우, 우상향
            numerator = count - (sum - X);
            denominator = 1 + (sum - X);
        }

        System.out.println(denominator + "/" + numerator);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for(int i=0; i<testCase; i++) {
            double originalPrice = Double.parseDouble(br.readLine());
            double discountedPrice = originalPrice * 0.8;
            System.out.printf("$%.2f\n", discountedPrice);
        }
    }
}

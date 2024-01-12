import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int p = Integer.parseInt(br.readLine());

        int maxDiscount = 0;

        if (n >= 5) {
            maxDiscount = Math.max(maxDiscount, 500);
        }
        if (n >= 10) {
            maxDiscount = Math.max(maxDiscount, p / 10);
        }
        if (n >= 15) {
            maxDiscount = Math.max(maxDiscount, 2000);
        }
        if (n >= 20) {
            maxDiscount = Math.max(maxDiscount, p / 4);
        }
        System.out.println(p <= maxDiscount ? 0 : p - maxDiscount);
    }
}

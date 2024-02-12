import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double prevTemp = Double.parseDouble(br.readLine());
        while (true) {
            double currentTemp = Double.parseDouble(br.readLine());
            if (currentTemp == 999) {
                break;
            }

            System.out.printf("%.2f\n", currentTemp - prevTemp);
            prevTemp = currentTemp;
        }
    }
}

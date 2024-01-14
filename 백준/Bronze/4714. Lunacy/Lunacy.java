import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            double earthWeight = Double.parseDouble(br.readLine());
            if(earthWeight < 0) break;
            double moonWeight = earthWeight * 0.167;
            System.out.printf("Objects weighing %.2f on Earth will weigh %.2f on the moon.\n", earthWeight, moonWeight);
        }
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long area = Long.parseLong(br.readLine());
        double side = Math.sqrt(area);

        double filament = 4 * side;

        System.out.printf("%.9f", filament);
    }
}

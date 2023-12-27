import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long area = Long.parseLong(br.readLine());

        double perimeter = Math.sqrt(area) * 4;
        System.out.println(perimeter);
    }
}

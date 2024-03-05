import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        if (N.charAt(0) == N.charAt(1)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

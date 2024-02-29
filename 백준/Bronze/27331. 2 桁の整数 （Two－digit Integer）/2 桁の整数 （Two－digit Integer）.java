import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int A = Integer.parseInt(br.readLine());
            int B = Integer.parseInt(br.readLine());
            System.out.println(A * 10 + B);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

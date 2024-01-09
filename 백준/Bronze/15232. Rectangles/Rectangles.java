import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int R = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();
        int quotient = n / 5;
        int remainder = n % 5;

        for (int i = 0; i < quotient; i++) {
            sb.append('V');
        }
        for (int i = 0; i < remainder; i++) {
            sb.append('I');
        }

        System.out.println(sb.toString());
    }
}

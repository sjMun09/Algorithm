import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();

        if (S.length() >= 5) {
            System.out.println(S.substring(S.length() - 5));
        } else {
            System.out.println(S);
        }
    }
}

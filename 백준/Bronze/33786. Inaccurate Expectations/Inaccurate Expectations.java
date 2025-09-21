import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s == null) {
            System.out.println(0);
            return;
        }
        s = s.trim();
        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }
        int n = Integer.parseInt(s);

        BigInteger F = BigInteger.ZERO;

        for (int i = 1; i <= n; i++) {
            F = BigInteger.valueOf(i).multiply(F.add(BigInteger.ONE));
        }

        System.out.println(F.toString());
    }
}

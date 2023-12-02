import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        BigInteger P = new BigInteger(input[0]);
        int K = Integer.parseInt(input[1]);

        for (int i = 2; i < K; i++) {
            BigInteger bigI = BigInteger.valueOf(i);
            if (P.mod(bigI).equals(BigInteger.ZERO)) {
                System.out.print("BAD " + i);
                return;
            }
        }
        System.out.print("GOOD");
    }
}
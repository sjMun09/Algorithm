import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger totalApple = new BigInteger(br.readLine());
        BigInteger moreApple = new BigInteger(br.readLine());

        BigInteger klaudiaApple = totalApple.add(moreApple).divide(BigInteger.valueOf(2));
        BigInteger nataliaApple = totalApple.subtract(klaudiaApple);

        System.out.println(klaudiaApple.toString());
        System.out.println(nataliaApple.toString());
    }
}

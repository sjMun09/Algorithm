import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String binaryInput = br.readLine();

        BigInteger decimal = new BigInteger(binaryInput, 2);
        BigInteger result = decimal.multiply(BigInteger.valueOf(17));

        System.out.println(result.toString(2));
    }
}

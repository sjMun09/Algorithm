import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args)throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            BigInteger a = new BigInteger(br.readLine());
            BigInteger b = new BigInteger(br.readLine());

            BigInteger sum = a.add(b);
            System.out.println(sum);
    }
}

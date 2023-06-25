import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args)throws IOException {
     
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] input = br.readLine().split(" ");
            BigInteger num1 = new BigInteger(input[0]);
            BigInteger num2 = new BigInteger(input[1]);

            BigInteger result = num1.multiply(num2);
            System.out.println(result);
    }
}

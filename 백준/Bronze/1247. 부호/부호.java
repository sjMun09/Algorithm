import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int t=0; t<3; t++) {
            int N = Integer.parseInt(br.readLine());
            BigInteger sum = BigInteger.ZERO;
            for(int i=0; i<N; i++) {
                sum = sum.add(new BigInteger(br.readLine()));
            }
            if(sum.equals(BigInteger.ZERO)) {
                System.out.println("0");
            } else if(sum.compareTo(BigInteger.ZERO) < 0) {
                System.out.println("-");
            } else {
                System.out.println("+");
            }
        }
    }
}

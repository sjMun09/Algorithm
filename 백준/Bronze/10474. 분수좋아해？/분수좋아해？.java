import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String input = br.readLine();
            String[] fraction = input.split(" ");
            int numerator = Integer.parseInt(fraction[0]);
            int denominator = Integer.parseInt(fraction[1]);
            
            if(numerator == 0 && denominator == 0) {
                break;
            }
            
            int quotient = numerator / denominator;
            int remainder = numerator % denominator;
            
            System.out.println(quotient + " " + remainder + " / " + denominator);
        }
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int number = Integer.parseInt(br.readLine());
        boolean containsSeven = String.valueOf(number).contains("7");
        boolean divisibleBySeven = number % 7 == 0;
        
        int result;
        
        if (!containsSeven && !divisibleBySeven) {
            result = 0;
        } else if (!containsSeven) {
            result = 1;
        } else if (!divisibleBySeven) {
            result = 2;
        } else {
            result = 3;
        }
        
        System.out.println(result);
    }
}

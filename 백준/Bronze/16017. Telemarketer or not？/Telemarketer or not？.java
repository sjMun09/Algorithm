import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> telemarketerNumbers = Arrays.asList(br.readLine(), br.readLine(), br.readLine(), br.readLine());
        String result = "answer";

        if ((telemarketerNumbers.get(0).equals("8") || telemarketerNumbers.get(0).equals("9")) &&
            (telemarketerNumbers.get(3).equals("8") || telemarketerNumbers.get(3).equals("9")) &&
            telemarketerNumbers.get(1).equals(telemarketerNumbers.get(2))) {
            result = "ignore";
        }

        System.out.println(result);
    }
}

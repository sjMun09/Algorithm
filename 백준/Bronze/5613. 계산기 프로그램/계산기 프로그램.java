import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long result = Long.parseLong(br.readLine());
        String operator = br.readLine();

        while (!operator.equals("=")) {
            long num = Long.parseLong(br.readLine());
            switch (operator) {
                case "+":
                    result += num;
                    break;
                case "-":
                    result -= num;
                    break;
                case "*":
                    result *= num;
                    break;
                case "/":
                    result /= num;
                    break;
                default:
                    break;
            }
            operator = br.readLine();
        }

        System.out.println(result);
    }
}
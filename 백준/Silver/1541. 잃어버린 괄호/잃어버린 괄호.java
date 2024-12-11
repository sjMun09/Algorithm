import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String expression = br.readLine();

        String[] splitByMinus = expression.split("-");

        int result = sumOfSubExpression(splitByMinus[0]);

        for (int i = 1; i < splitByMinus.length; i++) {
            result -= sumOfSubExpression(splitByMinus[i]);
        }

        System.out.print(result);
    }

    private static int sumOfSubExpression(String subExpression) {
        int sum = 0;
        String[] splitByPlus = subExpression.split("\\+"); 
        for (String num : splitByPlus) {
            sum += Integer.parseInt(num); 
        }
        return sum;
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] inputs = br.readLine().split(" ");
        int[] numbers = new int[3];

        for (int i = 0; i < 3; i++) {
            numbers[i] = Integer.parseInt(inputs[i]);
        }

        if (numbers[0] + numbers[1] == numbers[2]) {
            System.out.println(numbers[0] + "+" + numbers[1] + "=" + numbers[2]);
        } else if (numbers[0] - numbers[1] == numbers[2]) {
            System.out.println(numbers[0] + "-" + numbers[1] + "=" + numbers[2]);
        } else if (numbers[0] * numbers[1] == numbers[2]) {
            System.out.println(numbers[0] + "*" + numbers[1] + "=" + numbers[2]);
        } else if (numbers[0] / numbers[1] == numbers[2]) {
            System.out.println(numbers[0] + "/" + numbers[1] + "=" + numbers[2]);
        } else if (numbers[0] == numbers[1] + numbers[2]) {
            System.out.println(numbers[0] + "=" + numbers[1] + "+" + numbers[2]);
        } else if (numbers[0] == numbers[1] - numbers[2]) {
            System.out.println(numbers[0] + "=" + numbers[1] + "-" + numbers[2]);
        } else if (numbers[0] == numbers[1] * numbers[2]) {
            System.out.println(numbers[0] + "=" + numbers[1] + "*" + numbers[2]);
        } else {
            System.out.println(numbers[0] + "=" + numbers[1] + "/" + numbers[2]);
        }
    }
}

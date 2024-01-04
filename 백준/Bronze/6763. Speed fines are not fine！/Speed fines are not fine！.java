import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.function.IntFunction;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int speedLimit = Integer.parseInt(br.readLine());
        int carSpeed = Integer.parseInt(br.readLine());
        br.close();

        IntFunction<Integer> calculateFine = (int overSpeed) -> {
            if (overSpeed <= 0) return 0;
            if (overSpeed <= 20) return 100;
            if (overSpeed <= 30) return 270;
            return 500;
        };

        int overSpeed = carSpeed - speedLimit;
        int fine = calculateFine.apply(overSpeed);

        if (fine == 0) {
            System.out.println("Congratulations, you are within the speed limit!");
        } else {
            System.out.printf("You are speeding and your fine is $%d.%n", fine);
        }
    }
}

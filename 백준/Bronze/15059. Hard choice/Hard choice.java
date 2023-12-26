import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] availableMeals = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        
        int[] requestedMeals = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        
        int unsatisfiedPassengers = 0;
        
        for (int i = 0; i < 3; i++) {
            if (requestedMeals[i] > availableMeals[i]) {
                unsatisfiedPassengers += requestedMeals[i] - availableMeals[i];
            }
        }
        
        System.out.println(unsatisfiedPassengers);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        int mode = 0;

        for (int i = 0; i < 10; i++) {
            int number = Integer.parseInt(br.readLine());
            sum += number;
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
            if (frequencyMap.get(number) > maxFrequency) {
                maxFrequency = frequencyMap.get(number);
                mode = number;
            }
        }
        int average = sum / 10;
        System.out.println(average);
        System.out.println(mode);
    }
}

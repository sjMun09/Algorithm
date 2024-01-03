import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] depthReadings = new int[4];

        IntStream.range(0, 4).forEach(i -> {
            try {
                depthReadings[i] = Integer.parseInt(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        if (IntStream.range(0, 3).allMatch(i -> depthReadings[i] < depthReadings[i + 1])) {
            System.out.println("Fish Rising");
        } else if (IntStream.range(0, 3).allMatch(i -> depthReadings[i] > depthReadings[i + 1])) {
            System.out.println("Fish Diving");
        } else if (IntStream.range(0, 3).allMatch(i -> depthReadings[i] == depthReadings[i + 1])) {
            System.out.println("Fish At Constant Depth");
        } else {
            System.out.println("No Fish");
        }
    }
}

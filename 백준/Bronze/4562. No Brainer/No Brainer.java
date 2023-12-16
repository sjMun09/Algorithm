import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        IntStream.range(0, n).forEach(i -> {
            try {
                String[] input = br.readLine().split(" ");
                int eatenBrains = Integer.parseInt(input[0]);
                int requiredBrains = Integer.parseInt(input[1]);
                
                System.out.println(eatenBrains >= requiredBrains ? "MMM BRAINS" : "NO BRAINS");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}

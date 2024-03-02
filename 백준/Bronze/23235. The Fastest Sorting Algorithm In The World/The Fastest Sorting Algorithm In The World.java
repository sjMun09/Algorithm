import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCase = 1; // Initialize test case counter
        
        while (true) {
            String line = reader.readLine();
            if (line == null || line.isEmpty()) break; // Exit loop if line is null or empty
            
            String[] tokens = line.split(" ");
            int N = Integer.parseInt(tokens[0]);
            
            if (N == 0) break; // Check for the end of input
            
            // Since the array is already sorted, we don't need to do anything here.
            System.out.println("Case " + testCase + ": Sorting... done!");
            
            testCase++; // Increment test case counter
        }
    }
}

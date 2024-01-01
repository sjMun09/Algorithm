import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        long k = Long.parseLong(input[0]); 
        long w = Long.parseLong(input[1]); 
        long m = Long.parseLong(input[2]); 

        long requiredBumps = (w - k + m - 1) / m;

        System.out.println(requiredBumps);
    }
}

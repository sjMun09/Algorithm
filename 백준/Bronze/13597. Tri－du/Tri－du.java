import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int[] cards = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        int maxCard = Arrays.stream(cards).max().getAsInt();
        System.out.println(maxCard);
    }
}

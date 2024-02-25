import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int competitorPrice = Integer.parseInt(input[0]);
        int competitorPerformance = Integer.parseInt(input[1]);
        int warboyPrice = Integer.parseInt(input[2]);

        int warboyPerformance = (competitorPerformance / competitorPrice) * warboyPrice * 3;

        System.out.println(warboyPerformance);
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int[] scores = Arrays.stream(br.readLine().split(" "))
                                 .mapToInt(Integer::parseInt)
                                 .toArray(); 
            Arrays.sort(scores); 

            if (scores[3] - scores[1] >= 4) {
                System.out.println("KIN");
            } else {
                int sum = scores[1] + scores[2] + scores[3];
                System.out.println(sum);
            }
        }
    }
}

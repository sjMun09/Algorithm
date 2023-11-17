import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int scoreD = 0, scoreP = 0;

        for (int i = 0; i < N; i++) {
            String winner = br.readLine().trim();
            if (winner.equals("D")) {
                scoreD++;
            } else if (winner.equals("P")) {
                scoreP++;
            }

            if (Math.abs(scoreD - scoreP) > 1) {
                break;
            }
        }

        System.out.println(scoreD + ":" + scoreP);
    }
}
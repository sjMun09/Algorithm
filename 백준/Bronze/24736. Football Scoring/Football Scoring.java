import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] visitorScore = calculateScore(br.readLine());
        int[] homeScore = calculateScore(br.readLine());

        System.out.println(visitorScore[0] + " " + homeScore[0]);
    }

    private static int[] calculateScore(String line) {
        StringTokenizer st = new StringTokenizer(line, " ");
        int[] score = new int[5];
        int total = 0;

        for (int i = 0; i < 5; i++) {
            score[i] = Integer.parseInt(st.nextToken());
            switch (i) {
                case 0: total += score[i] * 6; break; // Touchdown
                case 1: total += score[i] * 3; break; // Field Goal
                case 2: total += score[i] * 2; break; // Safety
                case 3: total += score[i]; break; // Point after touchdown
                case 4: total += score[i] * 2; break; // Two-point conversion
            }
        }
        return new int[] {total};
    }
}

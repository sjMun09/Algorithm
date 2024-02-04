import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int player1 = 0, player2 = 0;
            
            for (int j = 0; j < n; j++) {
                String[] input = br.readLine().split(" ");
                String p1 = input[0], p2 = input[1];
                
                if (p1.equals(p2)) continue;
                
                if (p1.equals("R") && p2.equals("S") || p1.equals("S") && p2.equals("P") || p1.equals("P") && p2.equals("R")) {
                    player1++;
                } else {
                    player2++;
                }
            }
            
            if (player1 > player2) {
                System.out.println("Player 1");
            } else if (player1 < player2) {
                System.out.println("Player 2");
            } else {
                System.out.println("TIE");
            }
        }
    }
}

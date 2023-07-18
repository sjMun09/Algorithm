import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[][] board = new int[n][m];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                int cnt1 = 0;
                int cnt2 = 0;
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        if ((k + l) % 2 == 0) { 
                            if (board[i + k][j + l] == 'B') cnt1++;
                            else cnt2++;
                        } else { 
                            if (board[i + k][j + l] == 'W') cnt1++;
                            else cnt2++;
                        }
                    }
                }
                min = Math.min(min, Math.min(cnt1, cnt2));
            }
        }

        System.out.println(min);
    }
}
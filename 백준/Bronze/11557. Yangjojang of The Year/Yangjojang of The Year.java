import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int S = Integer.parseInt(br.readLine());
            int maxDrink = 0;
            String best = "";
            for (int j = 0; j < S; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String univ = st.nextToken();
                int drink = Integer.parseInt(st.nextToken());

                // 최대 술을 먹은 학교 찾기
                if (drink > maxDrink) {
                    maxDrink = drink;
                    best = univ;
                }
            }

            bw.write(best + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

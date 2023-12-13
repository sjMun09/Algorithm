import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] stats = new int[8];

            for(int j=0; j<8; j++){
                stats[j] = Integer.parseInt(st.nextToken());
            }

            int HP = Math.max(stats[0] + stats[4], 1);
            int MP = Math.max(stats[1] + stats[5], 1);
            int ATK = Math.max(stats[2] + stats[6], 0);
            int DEF = stats[3] + stats[7];

            System.out.println(HP + 5*MP + 2*ATK + 2*DEF);
        }
    }
}

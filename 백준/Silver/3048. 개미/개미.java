import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N1 = Integer.parseInt(st.nextToken());
            int N2 = Integer.parseInt(st.nextToken());

            String group1 = br.readLine();
            String group2 = br.readLine();
            int T = Integer.parseInt(br.readLine());

            char[] ants = new char[N1 + N2];
            boolean[] group1Dir = new boolean[N1 + N2];

            // Set initial positions
            for (int i = 0; i < N1; i++) {
                ants[N1 - i - 1] = group1.charAt(i);
                group1Dir[N1 - i - 1] = true;
            }
            for (int i = 0; i < N2; i++) {
                ants[N1 + i] = group2.charAt(i);
                group1Dir[N1 + i] = false;
            }

            // Simulation
            for (int t = 0; t < T; t++) {
                for (int i = 0; i < N1 + N2 - 1; i++) {
                    if (group1Dir[i] && !group1Dir[i + 1]) {
                        // Swap
                        char temp = ants[i];
                        ants[i] = ants[i + 1];
                        ants[i + 1] = temp;
                        
                        group1Dir[i] = false;
                        group1Dir[i + 1] = true;
                        i++;
                    }
                }
            }

            // Print result
            for (int i = 0; i < N1 + N2; i++) {
                bw.write(ants[i]);
            }
            bw.write("\n");

            bw.flush();
            bw.close();
            br.close();
    }
}
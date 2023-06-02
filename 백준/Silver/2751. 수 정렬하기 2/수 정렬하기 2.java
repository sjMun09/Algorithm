import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        int max = -1000001;
        int min = 1000001;
        int[] count;
        int[] N = new int[T];

        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(br.readLine());
            N[i] = num;
            if (max < num) max = num;
            if (min > num) min = num;
        }

        count = new int[max - min + 1];

        for (int i = 0; i < N.length; i++) {
            count[N[i] - min]++;
        }

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                bw.write((min + i) + "\n");
                count[i]--;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

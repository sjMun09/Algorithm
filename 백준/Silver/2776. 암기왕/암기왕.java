import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n1 = Integer.parseInt(br.readLine());
            int[] diary1 = new int[n1];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n1; j++) {
                diary1[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(diary1);

            int n2 = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();

            for (int k = 0; k < n2; k++) {
                int idx = Arrays.binarySearch(diary1, Integer.parseInt(st.nextToken()));
                if (idx >= 0) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            }

            System.out.print(sb.toString());
        }
    }
}

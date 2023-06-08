import java.io.*;
import java.util.*;


class Main{
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder print = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                StringBuilder sb = new StringBuilder(st.nextToken());
                print.append(sb.reverse());
                if (st.hasMoreTokens()) print.append(" ");
            }
            if (i <T-1) print.append("\n");
        }

        bw.write(print+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
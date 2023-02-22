import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 0 이 배, 1이 등 , 배 1 개 : 도
        String[] yut = {"D", "C", "B", "A", "E"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int sum = 0;
            while (st.hasMoreTokens()) {
                sum += Integer.parseInt(st.nextToken());
            }
            sb.append(yut[sum] + "\n");
        }
        System.out.println(sb);
    }
}

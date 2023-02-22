import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int temp=100;
        for (int i = 0; i < 7; i++) {
            int N = Integer.parseInt(br.readLine());

            //홀수
            if (N % 2 != 0) {
                sum += N;
                temp = Math.min(temp, N);
            }
         }
        if (sum == 0) {

            System.out.print(-1);
        } else {
            System.out.println(sum);
            System.out.print(temp);
        }

    }
}

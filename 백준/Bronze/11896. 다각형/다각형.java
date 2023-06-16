import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        long a = Long.parseLong(inputs[0]);
        long b = Long.parseLong(inputs[1]);

        long ans = 0L;
        if (a <= 2) a = 3;
        if (a % 2 == 1) a++;
        if (b % 2 == 1) b--;
        a /= 2;
        b /= 2;

        if (a > b) {
            ans = 0L;
        } else {
            ans = (b * (b + 1) - a * (a - 1));
        }
        System.out.println(ans);
    }
}

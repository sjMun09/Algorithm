import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final long nm = 10000001;
        long r, q, a, b, sum = nm, n, s=0;
        n = Long.parseLong(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            a = Long.parseLong(input[0]);
            b = Long.parseLong(input[1]);

            q = (((a - ((a - 1) % (b + 1))) / (b + 1) + 1) * 2);
            if (q < sum) {
                s = i + 1;
                sum = q;
            }
        }
        System.out.println(s + " " + sum);
    }
}

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] divisors = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            divisors[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(divisors);

        long result = (long) divisors[0] * divisors[n - 1];
        System.out.println(result);
    }
}
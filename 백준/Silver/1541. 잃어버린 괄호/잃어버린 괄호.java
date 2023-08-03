import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.MAX_VALUE;
        StringTokenizer sub = new StringTokenizer(br.readLine(), "-");
        while (sub.hasMoreTokens()) {
            int tmp =0;
            StringTokenizer add = new StringTokenizer(sub.nextToken(), "+");
            while (add.hasMoreTokens()) {
                tmp += Integer.parseInt(add.nextToken());
            }
            if (sum == Integer.MAX_VALUE)sum = tmp;
            else sum -= tmp;
        }
        System.out.print(sum);
    }
}
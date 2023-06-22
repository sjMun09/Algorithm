import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long a, b, c, d;

        for (a = 1; a <= n; ++a) {
            if (n % a == 0) {
                c = n / a;
                for (b = 1; b <= n + 2; ++b) {
                    if ((n + 2) % b == 0) {
                        d = (n + 2) / b;
                        if (a * d - b * c == n + 1) {
                            System.out.printf("%d %d %d %d", a, -b, c, d);
                            System.exit(0);
                        } else if (-a * d + b * c == n + 1) {
                            System.out.printf("%d %d %d %d", a, b, c, -d);
                            System.exit(0);
                        }
                    }
                }
            }
        }

        System.out.println("-1");
    }
}

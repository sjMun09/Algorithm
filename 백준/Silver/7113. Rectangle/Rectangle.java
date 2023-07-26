import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int g = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        getSquars(g, s);
        System.out.println(count);
    }

    private static void getSquars(int g, int s) {
        if (g == s) {
            count += 1;
            return;
        }

        int a = Math.min(g, s);
        if (g > s) {
            count += 1;
            getSquars(g - a, s);
        }
        if (g < s) {
            count += 1;
            getSquars(g, s - a);
        }
    }
}

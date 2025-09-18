import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static long countCows(long n, long m) {
        // 기저조건: 중앙 칸이 없는 경우
        if (n % 2 == 0 || m % 2 == 0) {
            return 0;
        }
        // 중앙에 1마리 + 4분할
        return 1 + 4 * countCows(n / 2, m / 2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        System.out.println(countCows(n, m));
    }
}

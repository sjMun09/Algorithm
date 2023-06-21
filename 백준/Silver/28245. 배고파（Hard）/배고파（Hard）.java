import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            long m = Long.parseLong(br.readLine());
            orderMenu(m);
        }
    }
    private static void orderMenu(long m) {
        int x = 0, y = 0;
        long closest = m; // 가장 가까운 가능한 숫자
        long minDiff = Long.MAX_VALUE;
        for (x = 0; x < 63; x++) {
            for (y = x; y < 63; y++) {
                long sum = (1L << x) + (1L << y);
                long diff = Math.abs(m - sum);
                if (diff < minDiff) {
                    minDiff = diff;
                    closest = sum;
                }
                if (minDiff == 0) break;
            }
            if (minDiff == 0) break;
        }
        // 가장 가까운 가능한 숫자로 m 대체
        if (closest != m) {
            m = closest;
        }
        // x, y값 찾기
        for (x = 0; x < 63; x++) {
            for (y = x; y < 63; y++) {
                long sum = (1L << x) + (1L << y);
                if (sum == m) {
                    System.out.println(x + " " + y);
                    return;
                }
            }
        }
    }
}
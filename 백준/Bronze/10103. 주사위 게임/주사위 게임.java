import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // int[] dice = {1, 2, 3, 4, 5, 6};
        int CY = 100; // 창영 점수
        int SD = 100; // 상덕 점수
        // 둘 숫자를 비교해서 작은 숫자가 나오면 그 숫자만큼 점수를 잃게 됨.
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a > b) {
                SD -= a;
            } else if (a < b) {
                CY -= b;
            }else continue;
        }
        System.out.println(CY);
        System.out.print(SD);
    }
}
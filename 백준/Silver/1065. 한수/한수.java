import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int Hansu = 0;

        // 입력받은 수까지 검사
        for (int i = 0; i <= N; i++) {
            if (isHansu(i)) Hansu++;
        }
        System.out.println(Hansu-1);
    }
    // 한수인지 아닌지 판별
    static boolean isHansu(int num) {
        if (num < 100) {
            return true;
        }
        //100 이상, 3자리일 경우
        else {
            // 각 자리수를 나눠서 생각할거임
            int a = num / 100; // 100
            int b = (num % 100) / 10; // 10
            int c = num % 10; // 1

            // 각 자리수가 등차수열을 이루는 조건
            if ((a - b) == (b - c)) {
                return true;
            } else return false;
        }
    }
}
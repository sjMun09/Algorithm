import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      문제를 이해하면, 생성자의 경우에는 1개 이상이기 때문에 최솟값을 찾기 위해서는 작은 수 부터 찾아야한다는 것을 알 수 있다.
        // 가장 기본적인 방법으로는 1 부터 입력받은 N 까지 한 개씩 모두 대입해보는 것입니다.
        // 참고로 이 방법은 브루트포스의 대표적인 방식입니다.

        int N = Integer.parseInt(br.readLine());

        int total = 0;
        for (int i = 0; i < N; i++) {
            int num = i;
            // 각 자릿수 합 초기화
            int sum = 0;
            while (num != 0) {
//              각 자릿수 더해주기 위해서 %10 해줘서 나머지 값만 더해주면 됨.
                sum += num % 10;
                num /= 10;
            }
            // 생성자 찾았을 경우, i 값과 각 자릿수 누적 합이 같을 경우
            if (sum + i == N) {
                total = i;
                break;
            }
        }
        System.out.print(total);
    }
}


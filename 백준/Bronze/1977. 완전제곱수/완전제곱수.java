import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        // 완전 제곱수(제곱) 구하는 로직
        // 없는경우 -1
//      자바 문법인 MIN_VALUE 와 MAX_VALUE 를 사용하면 된다. (타입형).MIN || MAX 사용
        int min = Integer.MAX_VALUE;
        int sum= 0;
        // i의 제곱이 N보다 커지게 되면, i를 생각할 필요가 없기 떄문에 i*i<=N까지 돌립니다.
        for (int i = 1; i * 1 <= N; i++) {
            if (i * i >= M && i * i <= N) {
                min = Math.min(i * i, min);
                sum += i * i;
            }
        }
        if (sum == 0) {
            System.out.print(-1);
        } else {
            System.out.print(sum + "\n" + min);
        }

    }
}


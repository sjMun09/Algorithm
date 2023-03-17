import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            // 10 번 데이터는 10번 컴퓨터
            if (a % 10 == 0) {
                System.out.println(10);
                continue;
            }
//          a 에 b 제곱을 구하여 뒷자리만 쓰면 됨
            //  숫자를 표한할 수 있는 자리수가 정해져 있기 때문에, 
            //  제곱을 구할때 마다 10으로 나눈 나머지만 가지고 계산해야 범위 내까지 계산 가능함.
            int sum = 1;
            for (int j = 0; j < b; j++) {
                sum = (sum * a) % 10;
            }
            System.out.println(sum);
        }

    }
}


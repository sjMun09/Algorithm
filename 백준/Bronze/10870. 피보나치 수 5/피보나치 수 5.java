import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] fibonacci = new int[N + 1];	// F(0) 부터 시작하니까,  N + 1 크기 생성해야함

        for(int i = 0; i < fibonacci.length; i++) {
            // F(0) 과 F(1) 은 각각 0 과 1 로 초기화  가장 작은 값부터 더해서 재귀를 빠져나가는 방식입니다.
            // 재귀 로직 자체는 0 또는 1을 입력 받을 때까 재귀호출을 하는 것입니다.
            // 그러나 저는 재귀 로직을 배열에 적용해서 코드를 구상하였습니다.
            if(i == 0) fibonacci[0] = 0;
            else if(i == 1) fibonacci[1] = 1;
            else fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println(fibonacci[N]);
    }
}


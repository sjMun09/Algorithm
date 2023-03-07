import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 로직,
        // 1일때 벌집 갯수 1 , 2일때 6 , 3일때 12, 4일때 18, 5일때 (61-38+1)=24
        // 방의 개수는 6의배수 임을 알 수 있다.
        int N = Integer.parseInt(br.readLine());

        // 둘다 최소값 기준
        int honeyComb = 1;
        int neighbor = 2;

        if (N == 1) {
            System.out.println(1);
        } else {
//          N보다 커지기 전까지만 반복해야됨
            while (neighbor <= N) {
                neighbor = neighbor + (6 * honeyComb);
                honeyComb++;
            }
            System.out.println(honeyComb);
        } 
        
    }
}


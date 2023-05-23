import java.io.*; 
import java.util.*;

public class Main { public static void main(String[] args) throws IOException { BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    
    // 참이 n개라는 말이 각각 몇 개인지 센다.
    int[] ct = new int[51];
    Arrays.fill(ct, 0);
    
    String[] input = br.readLine().split(" ");
    for (int i = 0, n; i < N; i++) {
        n = Integer.parseInt(input[i]);
        ct[n]++;
    }

    // 참이 n개다 라는 말이 n개와 같다면 이는 참이 된다.
    for (int i = 50; i >= 0; i--) {
        if (ct[i] == i) {
            System.out.println(i);
            return;
        }
    }
    
    // 참인 말을 찾지 못했다면 -1 출력
    System.out.println(-1);
}
}
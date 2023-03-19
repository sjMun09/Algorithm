import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        // 참고로
        Integer[] x = new Integer[N];
        st = new StringTokenizer(br.readLine());
        // k등 뽑는 로직
        for (int i = 0; i < N; i++) {
            x[i] = Integer.parseInt(st.nextToken());
            }
        Arrays.sort(x, Collections.reverseOrder());
        System.out.print(x[k - 1]);
    
    }
}


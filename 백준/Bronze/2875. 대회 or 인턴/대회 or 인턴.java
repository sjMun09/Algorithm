import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int count = 0;

        //n+m>=3+k는 남+여 수 3 이 하나의팀과 인터쉽 명 수와 같은지 체크
        while (n >= 2 && m >= 1 && n + m >= 3 + k) {
            n = n - 2;
            m = m - 1;
            count++;
        }
        System.out.print(count);

    }
}

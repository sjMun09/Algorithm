import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int E = Integer.parseInt(st.nextToken()); 
        int S = Integer.parseInt(st.nextToken()); 
        int M = Integer.parseInt(st.nextToken()); 

        int EA = 0;  // 실제 연도
        int SA = 0;
        int MA = 0;
        int year = 0;

        for (;;) { 
            year++;
            EA++;
            SA++;
            MA++;
            if (EA == 16) EA = 1;
            if (SA == 29) SA = 1;
            if (MA == 20) MA = 1;
            if (EA == E && SA == S && MA == M) break;
        }

        System.out.print(year);
    }
}
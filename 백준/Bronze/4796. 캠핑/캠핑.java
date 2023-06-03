import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNumber = 1;
        
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
        
            if (L == 0 && P == 0 && V == 0) {
                break; // 종료조건
            }
            
            int caseResult = (V / P) * L + Math.min(V % P, L);
            System.out.println("Case " + caseNumber + ": " + caseResult);
            caseNumber++;
        }
    }
}

import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] a) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        boolean[] chk = new boolean[N+1];
        st = new StringTokenizer(br.readLine());
         while(st.hasMoreTokens()) {
            chk[Integer.parseInt(st.nextToken())] = true;
        }
        int tmp;
        int[] ink = new int[N+1];
        for(int i=1; i<N+1; i++) {
            ink[i] = ink[i-1] +7;
            if(!chk[i]) {
               tmp = 0; 
                for(int j=i; j>0; j--) {
                    tmp = ink[i-j] + 2*j +5;
                    ink[i] = ink[i] > tmp ? tmp : ink[i];
                }
            } else {
                ink[i] = ink[i-1];
            }
        }
        System.out.print(ink[N]);
    }
}
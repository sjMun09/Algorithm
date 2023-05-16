import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        // 입력
        for(int i=0; i<T;i++){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
            int result = gcd(A,B);
            
            sb.append(A*B/result).append('\n');
        }System.out.print(sb);
        
    }
    public static int gcd(int A, int B){
        while(B!=0){
            int r = A % B; // 나머지 구하기
            // gcd(a,b) = GCD(b,r)임. 즉, 변환함
            // 만약, 이해가 안된다면, 배열 소팅을 생각해보면 됨.
            A= B;
            B = r; 
        } return A;
    }
}
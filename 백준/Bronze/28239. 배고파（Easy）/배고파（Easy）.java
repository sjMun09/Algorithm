import java.util.*;
import java.io.*;
import java.math.*;


class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            long m = Long.parseLong(br.readLine());
            solve(m);
        }
        br.close();
    }
    public static void solve(long m){
        for (int x = 0; x < 63; x++) {
            for(int y=x;y<63;y++){ // long 타입의 최댓값을 확인할거 2^63-1 이라고 생각하면됨.
                long sum = (1L<<x)+(1L<<y); // 비트 시프트 연산 사용
                if(sum==m){
                    System.out.println(x+" "+y);
                    break;
                }
            }
        }
    }
}
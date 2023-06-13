import java.io.*;
import java.util.*;

public class Main {
    static int cnt1 = 0;
    static int cnt2 = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        fib(n);
        fibonacci(n);
        System.out.print(cnt1+" "+cnt2);

    }
    // 재귀
    public static int fib(int n){
        if(n==1 || n==2){
            cnt1++;
            return 1;
        }
        else return (fib(n - 1) + fib(n - 2));
    }
    // 동적 프로그래밍
    public static int fibonacci(int n){
        int[] f = new int[n];
        f[0]=1;
        f[1]=1;
        for (int i = 2; i < n; i++) {
            cnt2++;
            f[i] = f[i - 2] + f[i - 1];
        }

        return f[n-1];
    }

}

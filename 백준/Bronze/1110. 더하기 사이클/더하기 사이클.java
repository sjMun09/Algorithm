import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cp = N;
        int count =0;
        
        //  N 십의 자릿수는 나누기 10 을 하면 N이 한 자릿수이면 0,
        //  그 외에는 십의 자릿수가 그대로 반환.
        //  N % 10 일의자릿수 
        
        do {
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            count++;
        } while (cp != N);
        System.out.print(count);
    }
}


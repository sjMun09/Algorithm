import java.io.*;
import java.math.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int numCount = Integer.parseInt(st.nextToken());
        int quizNum = Integer.parseInt(st.nextToken());
        
        long[] S = new long[numCount + 1]; // 질의항을 바로 사용하기 위해서 --> 인덱스는 원래 0번부터 시작
        st = new StringTokenizer(br.readLine());
        
        for (int i = 1; i <= numCount; i++) {
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken()); // 합배열 공식
        }
        
        for (int q = 0; q < quizNum; q++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(S[j]-S[i-1]);
        }
    }
}

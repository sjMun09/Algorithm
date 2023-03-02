import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++) { 
            int n = Integer.parseInt(br.readLine()); 

            int index=0; 

            while(n>0) { //나누는 수가 0 이상이면 실행
                if(n%2==1) { //나머지가 1이면 이진수로 나타냈을 때 1이 됨
                    System.out.print(index + " "); //인덱스값 출력 
                }
                n/=2; //n은 n를 2로 나눈 몫
                index++; //인덱스값 +1 하고
                //반복
            }
            System.out.println(); //하나의 n이 끝나면 줄바꿈
        }
    }
}

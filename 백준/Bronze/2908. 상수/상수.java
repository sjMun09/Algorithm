import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//      토큰을 생성해서 띄어쓰기로 각 토큰을 나눠줌
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
//      나눠준 토큰을 StringBuilder의 reverse() 메소드를 사용해서 문자열을 뒤집어줌. 
//      그리고 StringBuilder 타입을 문자열로 반환시키기 위해 toString()메소드 사용. 이후 Integer.parseInt()로 문자열을 다시 숫자로 바꿔줌
        int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        System.out.print(A > B ? A:B);

    }
}


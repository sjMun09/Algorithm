import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        
        //for 반복문 사용하지 않고 코드길이 최대한 간결 + 빠른 출력을 하는 logic
        while( N > 0 ) {
            System.out.println(N);
            N--;
        }

    }
}
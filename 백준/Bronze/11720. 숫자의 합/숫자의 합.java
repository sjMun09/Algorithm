import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      입력만 받음. => 어차피 byte[]로 변환하여 사용할 것이라서.
        br.readLine();

        int sum = 0;
        for (byte N : br.readLine().getBytes()) {
            sum += (N - '0'); // 이렇게 표현하거나 아니면 (a-48)을 해주면 원하는 값 도출 가능.(UTF-16 때문)
        }
        System.out.println(sum);
    }
}
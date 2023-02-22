import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

//       1개의 컴퓨터에는 무조건 꽂을 수 있으므로 초기화
        int cont = 1;
        for (int i = 0; i < N; i++) {
            cont += Integer.parseInt(br.readLine());
        }
//      멀티탭 꽂은 개수만큼 빼줘야함
        cont -= N;
        System.out.println(cont);
    }
}
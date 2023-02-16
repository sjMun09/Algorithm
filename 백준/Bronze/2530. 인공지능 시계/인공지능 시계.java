import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int d = Integer.parseInt(br.readLine());

//      1분은 60초이기에 d분에 60을 나눠서 나온 몫과 나머지를 각 분 각초에 합산.
        m += d / 60;
        s += d % 60;
//      s초를 60초 아래로 정리해주기 위해 나눠서 몫과 나머지를 분과 초에 합산 및 대입
        m += s / 60;
        s = s % 60;
//      똑같은 로직
        h += m / 60;
        m = m % 60;
//      24시 제한
        h = h % 24;


        System.out.print(h+" "+m+" "+s);
    }
}
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
//        공의 위치는 1번이니까.
        int temp = 1;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            //공의 위치가 바뀔경우 공위 위치를 다시 저장해야함, 공은 움직이지 않기 떄문.
            if (x == temp) {
                temp = y;
            } else if (y == temp) {
                temp = x;
            }


        }
        System.out.print(temp);
    }
}

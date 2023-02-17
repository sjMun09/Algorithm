import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
//        1-1 단계 : 45분보다 작은지 여부 - if (min < 45 )
//        2-1 단계 : 시(hour) 가 0보다 작은지 여부 - if (hour < 0 )
//        1-2 단계 : 1단계 조건 외 여부 - else
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if(M < 45) {
            H--;
            M= 60 - (45 - M);
            if(H < 0) {
                H = 23;
            }
            System.out.println(H + " " + M);
        }
        else {
            System.out.println(H+" "+(M-45));
        }
    }
}
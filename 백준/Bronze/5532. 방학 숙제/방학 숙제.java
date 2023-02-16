import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());

        int kor = A / C;
        int math = B / D;

        if (A % C != 0) {
            kor++;
        }
        if (B % D != 0) {
            math++;
        }
        int day = Math.max(kor, math);
        System.out.println(L - day);
    }
}
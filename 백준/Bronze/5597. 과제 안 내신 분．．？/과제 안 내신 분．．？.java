import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[31];
        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[n] = true;
        }
        for (int i = 1; i <= 30; i++) {
            // 불리지 않은 사람 출력
            if (! arr[i]) System.out.println(i);
        }

    }
}

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 하얀칸은 홀수 반복, 검정칸은 짝수반복
        int count = 0;
        for (int i = 0; i < 8; i++) {
            String s = br.readLine();
            for (int j = 0; j < 8; j++) {
                if (s.charAt(j) == 'F' && (i + j) % 2 == 0) {
                    count++;
                }
            }
        }
        System.out.print(count);

    }
}


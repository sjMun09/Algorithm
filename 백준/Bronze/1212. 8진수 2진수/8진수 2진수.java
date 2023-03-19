import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        // 각 숫자를 2진수로 나눠서 계산해줄 예정이라서 미리 배열에 초기화
        String[] arr = {"000", "001", "010", "011", "100", "101", "110", "111"};

        for (int i = 0; i < str.length(); i++) {
            // 맨 앞은 '0' 빼기
            int n = str.charAt(i) - '0';
            sb.append(arr[n]);
        }
        if (str.equals("0")) {
            System.out.print(str);
        } else {
            while (sb.charAt(0) == '0')
                // int start
                sb = new StringBuilder(sb.substring(1));
                System.out.print(sb);

        }
    }
}


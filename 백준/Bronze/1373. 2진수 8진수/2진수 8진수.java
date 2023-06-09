import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();

        change(number);
    }

    static void change(String num) {
        StringBuilder sb = new StringBuilder();
        int len = num.length();

        // 입력값의 길이가 3으로 나누어 떨어지지 않는 경우를 처리하기 위한 부분
        int remainder = len % 3;
        if (remainder != 0) {
            int partialOctalValue = 0;
            for (int i = 0; i < remainder; i++) {
                partialOctalValue = partialOctalValue * 2 + (num.charAt(i) - '0');
            }
            sb.append(partialOctalValue);
        }

        // 3자리씩 묶어서 처리하는 부분
        for (int i = remainder; i < len; i += 3) {
            int octalValue = (num.charAt(i) - '0') * 4
                    + (num.charAt(i + 1) - '0') * 2
                    + (num.charAt(i + 2) - '0');
            sb.append(octalValue);
        }

        System.out.print(sb.toString());
    }
}

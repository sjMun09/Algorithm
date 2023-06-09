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
        int remainder = len % 3;
        if (remainder != 0) {
            int partialOctalValue = 0;
            for (int i = 0; i < remainder; i++) {
                partialOctalValue = partialOctalValue * 2 + (num.charAt(i) - '0');
            }
            sb.append(partialOctalValue);
        }
        for (int i = remainder; i < len; i += 3) {
            int octalValue = (num.charAt(i) - '0') * 4
                    + (num.charAt(i + 1) - '0') * 2
                    + (num.charAt(i + 2) - '0');
            sb.append(octalValue);
        }
        System.out.print(sb.toString());
    }
}

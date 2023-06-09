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

        int remainder = num.length() % 3;
        if (remainder > 0) {
            sb.append(Integer.toOctalString(Integer.parseInt(num.substring(0, remainder), 2)));
        }

        for (int i = remainder; i < num.length(); i += 3) {
            sb.append(Integer.toOctalString(Integer.parseInt(num.substring(i, i + 3), 2)));
        }

        System.out.print(sb.toString());
    }
}

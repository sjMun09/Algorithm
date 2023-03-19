import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        // 문자열로 받았으니 이것을 Integer 를 써서 정수로 바꿔줌.
        int n = Integer.parseInt(str, 16);
        System.out.print(n);

    }
}


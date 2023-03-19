import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String index = br.readLine();
        int mid = index.length() / 2;
        int flag = 1;
        for (int i = 0; i < mid; i++) {
            if (index.charAt(i) != index.charAt(index.length() - 1 - i)) {
                flag = 0;
            }
        }
        System.out.print(flag);
    }
}


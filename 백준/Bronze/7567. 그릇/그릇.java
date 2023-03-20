import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int setting = 10;

        for (int i = 1; i < str.length(); i++) {
            // 똑같다면 5
            if (str.charAt(i) == str.charAt(i - 1)) {
                setting += 5;
            } else {
                // 다르면 10
                setting += 10;
            } 
        }
        System.out.print(setting);

    }
}


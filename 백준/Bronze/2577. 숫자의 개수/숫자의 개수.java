import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        int index = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());

        String str = String.valueOf(index);

        for (int i = 0; i < str.length(); i++) {
            arr[(str.charAt(i) - 48)]++;
        }

        for (int v : arr) {
            System.out.println(v);
        }

    }
}

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[42];

        for (int i = 0; i < 10; i++) {
            arr[Integer.parseInt(br.readLine()) % 42] = true;
        }
        int count = 0;
        for (boolean value : arr) {
//           value 가 true 라면
            if (value) {
                count++;
            }
        }
        System.out.println(count);
        
    }
}

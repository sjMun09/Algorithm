import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            hashSet.add(Integer.parseInt(br.readLine()) % 42);
        }
        System.out.println(hashSet.size());
    }
}
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        StringBuilder sb = new StringBuilder(br.readLine());

        for (int i = 0; i < sb.length(); i++) {
            sum += sb.charAt(i) - '0';
        }
        System.out.print(sum);

    }
}

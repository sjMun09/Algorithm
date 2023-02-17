import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int count = 0;

        for (int i = 0; i < 9; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input > max) {
                max = input;
                count = i+1;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}

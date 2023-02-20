import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        br.close();

        for (int i = 0; i < input.length(); i++) {
            System.out.print(input.charAt(i));
            if (i % 10 == 9) {
                System.out.println();
            }
        }
    }
}

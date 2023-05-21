import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();

        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                c += 13;
                if (c > 'Z') {
                    c -= 26;
                }
            } else if (c >= 'a' && c <= 'z') {
                c += 13;
                if (c > 'z') {
                    c -= 26;
                }
            }

            result.append(c);
        }
        
        System.out.print(result.toString());
    }
}
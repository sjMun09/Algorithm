import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;

        String input = null;
        int[] count;
        while((input = br.readLine()) != null) {
            count = new int[4];
            sb = new StringBuilder();

            for(int i = 0; i < input.length(); i++) {
                int code = input.charAt(i);

                if(97 <= code && code <= 122) {
                    count[0] += 1;
                }else if(65 <= code && code <= 90) {
                    count[1] += 1;
                }else if(48 <= code && code <= 57) {
                    count[2] += 1;
                }else if(code == 32) {
                    count[3] += 1;
                }
            }
            for (int i : count) {
                sb.append(i).append(" ");
            }
            System.out.println(sb);
        }
    }
}


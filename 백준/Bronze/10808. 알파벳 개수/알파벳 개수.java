import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
//        EJOTY  => 알파벳 총 갯수임
        int[] count = new int[26];

        String input = br.readLine();
        for (int i = 0; i < input.length(); i++) {
            count[(int) input.charAt(i) - 97] += 1;
        }
        for (int i = 0; i < count.length; i++) {
            sb.append(count[i]);
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
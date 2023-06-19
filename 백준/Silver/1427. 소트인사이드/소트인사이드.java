import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] n = br.readLine().toCharArray();
        Arrays.sort(n);
        for (int i = n.length - 1; i >= 0; i--) {
            bw.write(n[i]);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
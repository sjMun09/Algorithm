import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String T = br.readLine();
        String P = br.readLine();

        ArrayList<Integer> matching = KMP(T, P);

        bw.write(matching.size() + "\n");
        for (int position : matching) {
            bw.write((position + 1) + " ");
        }
        bw.flush();
        bw.close();
    }

    private static int[] getPi(String pattern) {
        int m = pattern.length();
        int[] pi = new int[m];
        int j = 0;
        for (int i = 1; i < m; i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = pi[j - 1];
            }
            if (pattern.charAt(i) == pattern.charAt(j)) {
                pi[i] = ++j;
            }
        }
        return pi;
    }

    private static ArrayList<Integer> KMP(String text, String pattern) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] pi = getPi(pattern);
        int n = text.length();
        int m = pattern.length();
        int j = 0;
        for (int i = 0; i < n; i++) {
            while (j > 0 && text.charAt(i) != pattern.charAt(j)) {
                j = pi[j - 1];
            }
            if (text.charAt(i) == pattern.charAt(j)) {
                if (j == m - 1) {
                    ans.add(i - m + 1);
                    j = pi[j];
                } else {
                    j++;
                }
            }
        }
        return ans;
    }
}

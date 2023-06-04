import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = br.readLine();
        }

        Arrays.sort(words, new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                } else {
                    return s1.length() - s2.length();
                }
            }
        });

        bw.write(words[0] + "\n");

        for (int i = 1; i < n; i++) {
            if (!words[i].equals(words[i - 1])) {
                bw.write(words[i] + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (checkingWord(word)) count++;
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean checkingWord(String words) {
        boolean[] alphabet = new boolean[26];
        for (int i = 0; i < words.length(); i++) {
            char okChar = words.charAt(i);
            if (!alphabet[okChar - 'a']) {
                alphabet[okChar - 'a'] = true;
                while (i + 1 < words.length() && words.charAt(i) == words.charAt(i + 1)) {
                    i++;
                }
            }else
                return false;
        }
        return true;
    }
}

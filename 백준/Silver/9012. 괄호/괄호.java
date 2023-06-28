import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            boolean isVPS = true;
            Stack<Character> stack = new Stack<>();
            String input = br.readLine();
            for (char ch : input.toCharArray()) {
                if (ch == '(') {
                    stack.push(ch);
                } else if (stack.isEmpty()) {
                    isVPS = false;
                    break;
                } else {
                    stack.pop();
                }
            }
            if (!stack.isEmpty()) {
                isVPS = false;
            }
            bw.write(isVPS ? "YES" : "NO");
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
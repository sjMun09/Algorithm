import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            if (current == 'P') {
                stack.push(current);
            } else {
                if (stack.size() >= 2 && i < str.length() - 1 && str.charAt(i + 1) == 'P') {
                    stack.pop();
                    stack.pop();
                } else {
                    System.out.print("NP");
                    return;
                }
            }
        }
        if (stack.size() == 1 && stack.peek() == 'P') {
            System.out.print("PPAP");
        } else {
            System.out.print("NP");
        }
    }
}
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            System.out.print("Case #"+(i+1)+": ");
            String[] words = br.readLine().split(" "); // split 으로 잘라줌
            Stack<String> stack = new Stack<>();
            for (String word : words) {
                stack.push(word);
            }
            while (!stack.isEmpty()) {
                System.out.print(stack.pop()+" ");
            }
            System.out.println();
        }
    }
}

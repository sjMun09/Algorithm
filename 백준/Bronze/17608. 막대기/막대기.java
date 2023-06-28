import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] jar = new int[N];
        for (int i = 0; i < N; i++) {
            jar[i] = Integer.parseInt(br.readLine());
        }
        Stack<Integer> stack = new Stack<>();
        int maxHeight = 0;

        for (int i = N - 1; i >= 0; i--) {
            if (jar[i] > maxHeight) {
                maxHeight = jar[i];
                stack.push(maxHeight);
            }
        }
        System.out.print(stack.size());
    }
}

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] pay = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            pay[i] = Integer.parseInt(st.nextToken());
        }

        System.out.print(getMaxMoney(pay));
    }

    private static long getMaxMoney(int[] pay) {
        Stack<Integer> stack = new Stack<>();
        long maxMoney = 0;

        for (int i = 0; i < pay.length; i++) {
            while (!stack.isEmpty() && pay[stack.peek()] > pay[i]) {
                int height = pay[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxMoney = Math.max(maxMoney, (long) height * width);
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int height = pay[stack.pop()];
            int width = stack.isEmpty() ? pay.length : pay.length - stack.peek() - 1;
            maxMoney = Math.max(maxMoney, (long) height * width);
        }

        return maxMoney;
    }
}

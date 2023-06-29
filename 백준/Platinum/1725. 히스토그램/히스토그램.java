import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1725 히스토그램 플래티넘 4 Stack 알고리즘으로 풀이.
        // 스택 알고리즘의 종류 중 모노톤 알고리즘이라고 보면됩니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] histogram = new long[N];
        for (int i = 0; i < N; i++) {
            histogram[i] = Long.parseLong(br.readLine());
        }
        Stack<Integer> stack = new Stack<>();
        long maxArea = 0;

        for (int i = 0; i < N; i++) {
            while (!stack.isEmpty() && histogram[stack.peek()] > histogram[i]) {
                long height = histogram[stack.pop()];
                int width = (stack.isEmpty() ? i : i - stack.peek() - 1);
                maxArea = Math.max(maxArea, width * height);
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            long height = histogram[stack.pop()];
            int width = (stack.isEmpty() ? N : N - stack.peek() - 1);
            maxArea = Math.max(maxArea, width * height);
        }

        System.out.print(maxArea);
    }
}

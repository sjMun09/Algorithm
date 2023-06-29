import java.io.*;
import java.util.*;

public class Main {
    // 12846 플레티넘 5, 무서운 아르바이트,   stack 문제임.
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

        for (int i = 0; i <= pay.length; i++) {
            // 스택이 비어있지 않고,
            // i 가 배열의 총 길이와 같거나(stack에 있는 요소를 처리해야할 때)
            // 또는 현재 스택의 맨 위 요소에 있는 인덱스의 값이 더 큰 경우
            while (!stack.isEmpty() && (i == pay.length || pay[stack.peek()] > pay[i])) {
                int poppedIndex = stack.pop(); // 스택에서 맨 위의 인덱스 제거
                int height = pay[poppedIndex]; // 제거된 인덱스의 값(고려되는 타이어 세트 가격)
                int leftIndex = stack.isEmpty() ? 0 : stack.peek() + 1; // 제거된 인덱스의 왼쪽 인덱스
                int width = i - leftIndex; // 제거된 인덱스까지의 범위 길이
                long calculatedMoney = (long) height * width; // 구한 범위와 가격을 곱하여 계산된 최대 가치
                maxMoney = Math.max(maxMoney, calculatedMoney); // 최대 가치 업트
            }
            stack.push(i); // 현재 인덱스를 스택에 푸쉬
        }

        return maxMoney;
    }
}

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 11861 Maximal Area 플레 5 히스토그램이랑 비슷한 것 같음.
        /*
        이해하기 쉽게 예시를 들면,
        4
        3 5 1 4 를 입력한다면 각 막대기의 높이는 3514입니다. 그러나 이 문제는 면적을 구하는 문제입니다.
        참고로, 직 사각형을 만들 때에는 기준이 되는 최소 높이를 항상 고려해야합니다.
        따라서, 가장 큰 직사각형의ㅣ 높이는 3이고 너비는 2이게 되는 것입니다. (막대1+2 합쳤다고 보면됨)
        참고, 막대 1과 막대 2는 말 그대로 첫 번째, 두 번째 막대입니다.
        따라서, 막대 1: 높이 3, 막대 2: 높이 5 라서 두개를 결합해서 만들었다고 보시면 됩니다.
        -->  가장 큰 직사각형을 만들기 위해서는 두 막대 중 최소 높이인 3을 기준으로 직사각형의 높이를 결정해야 합니다.
        그렇지 않으면 직사각형의 범위가 높이 3을 넘어서게 되어 더 큰 면적을 구할 수 없습니다.
        그러므로 높이가 3인 직사각형을 결합한 직사각형은 아래와 같은 모양이 됩니다
        # #
        # #
        #
        따라서 아래로 #이 3개 가로로 #이 2개이니까 3 * 2 = 6 입니다.
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] histogram = new int[n];
        String[] str = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            histogram[i] = Integer.parseInt(str[i]);
        }

        long maxArea = getMaxArea(histogram, n);
        System.out.print(maxArea);
    }

    public static long getMaxArea(int[] histogram, int n) {
        Stack<Integer> stack = new Stack<>();
        long maxArea = 0;

        for (int i = 0; i < n; i++) {
            while (!stack.empty() && histogram[stack.peek()] > histogram[i]) {
                int height = histogram[stack.pop()];
                int width = stack.empty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, (long) width * height);
            }
            stack.push(i);
        }

        while (!stack.empty()) {
            int height = histogram[stack.pop()];
            int width = stack.empty() ? n : n - stack.peek() - 1;
            maxArea = Math.max(maxArea, (long) width * height);
        }

        return maxArea;
    }
}

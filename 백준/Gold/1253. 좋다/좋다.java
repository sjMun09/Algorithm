import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        // 1253 번 좋다 문제는 투 포인터 문제임.
        int N = Integer.parseInt(br.readLine());
        int[] number = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(number);
        int answer = 0;
        for (int i = 0; i < N; i++) {
            int left = 0;
            //  right 는 음수값이 존재함
            int right = N - 1;
            while (true) {
                // 현재위치 = i
                if (left == i) left++;
                else if (right == i) right--;
                // answer 존재 x
                if (left >= right) break;
                // 투 포인터로 밀어주는거임. 왼쪽으로 움직이는 right 값을 변경
                if (number[left] + number[right] > number[i]) right--;
                else if (number[left] + number[right] < number[i]) left++;
                else {
                    answer++;
                    break;
                }
            }
        }
        System.out.print(answer);
    }
}

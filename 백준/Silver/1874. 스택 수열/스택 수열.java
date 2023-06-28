import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        // input
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        // Stack create
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int num =1; // 오름차순  --> sorting 을 그냥 하면 되는거 아닌가 ? 흠..
        boolean result = true;
        for (int i = 0; i < arr.length; i++) {
            int su = arr[i]; // 수에 input 넣어줌. --> 현재 수열의 수
            if (su >= num) {
                while (su >= num) { // push()
                    stack.push(num++); //  항아리에 data 를 추가해줌.
                    sb.append("+\n");
                }
                stack.pop(); // 데이터를 추가해줬으니까  햔제 있는 데이터를 삭제 및 확인 해야함.
                sb.append("-\n");
            } else { // 현재 수열(n) 값 < 오름차순 자연수 클 경우,
                // pop()을 수행해 수열 원소를 꺼냄.
                int n = stack.pop();

                // stack 가장 위의 수 top 이 만들어야하는 수열의 수보다 크면 수열 출력 x
                if (n > su) {
                    System.out.print("NO");
                    result = false;
                    break;
                } else {
                    sb.append("-\n");
                }
            }
        }
        if (result) System.out.println(sb.toString());
    }
}

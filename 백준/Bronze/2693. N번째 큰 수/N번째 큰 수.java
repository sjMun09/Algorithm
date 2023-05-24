import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        MyClass myClass = new MyClass();
        myClass.processUserInput();
    }
}

class MyClass {
    BufferedReader br;
    StringBuilder sb;

    public MyClass() {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
    }

    public void processUserInput() throws IOException {
        int T = Integer.parseInt(br.readLine());  
        for (int i = 0; i < T; i++) {
            int[] arr = readIntArrayFromInput();
            Arrays.sort(arr);  // 오름차순 정렬
            sb.append(arr[7] + "\n");  // 3번째 큰 수
        }
        System.out.print(sb);
    }

    private int[] readIntArrayFromInput() throws IOException {
        int[] arr = new int[10];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int j = 0; j < 10; j++) {
            arr[j] = Integer.parseInt(st.nextToken());
        }
        return arr;
    }
}

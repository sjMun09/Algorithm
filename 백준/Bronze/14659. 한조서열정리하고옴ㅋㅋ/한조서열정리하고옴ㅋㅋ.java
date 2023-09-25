import java.io.*;
import java.util.*;
public class Main {

    private static int answer = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st= new StringTokenizer(br.readLine());;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = i + 1; j < N; j++) {
                if (arr[i] > arr[j]) { // 자신보다 높은 봉우리면 킬
                    count++;
                } else { // 자신보다 낮은 봉우리면 포기
                    break;
                }
            }
            answer = Math.max(answer, count);
        }
        System.out.println(answer);
    }
}
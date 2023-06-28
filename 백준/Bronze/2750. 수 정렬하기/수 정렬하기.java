import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Bubble 정렬 -- > Arrays.sort() 사용 x
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        // input
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        // sorting
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1; j++) {
                // import logic
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]+"\n");
        }
    }
}
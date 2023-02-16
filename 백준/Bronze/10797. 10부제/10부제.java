import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[5];
        int count=0;
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
                if (N == arr[i]) {
                  count ++;
                }
        }
        System.out.println(count);
    }
}
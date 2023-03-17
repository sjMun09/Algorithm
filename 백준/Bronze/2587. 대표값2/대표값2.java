import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            // 총합
            sum += arr[i];
        }
//      배열 오름차순 정렬
        Arrays.sort(arr);

        System.out.println(sum / 5);
        System.out.print(arr[2]);
    }
}


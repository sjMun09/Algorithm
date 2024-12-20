import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] incDp = new int[n]; // 증가수열의 최대 길이
        int[] decDp = new int[n]; // 감소수열의 최대 길이

        // 증가
        for (int i = 0; i < n; i++) {
            incDp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    incDp[i] = Math.max(incDp[i], incDp[j] + 1);
                }
            }
        }

        // 감소
        for (int i = n - 1; i >= 0; i--) {
            decDp[i] = 1;
            for (int j = n - 1; j > i; j--) {
                if (arr[j] < arr[i]) {
                    decDp[i] = Math.max(decDp[i], decDp[j] + 1);
                }
            }
        }
        // 가장 긴 바이토닉 걸러냄
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            maxLength = Math.max(maxLength, incDp[i] + decDp[i] - 1);
        }

        System.out.print(maxLength);
    }
}
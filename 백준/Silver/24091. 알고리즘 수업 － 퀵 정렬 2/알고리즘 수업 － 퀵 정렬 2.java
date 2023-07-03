import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int K;

    static ArrayList<Integer> arr = new ArrayList<>();

    static int cnt = 0;

    public static int partition(int[] data, int left, int right) {
        int pivot = data[right];
        int i = left - 1;

        for (int j = left; j <= right - 1; j++) {
            if (data[j] <= pivot) {
                swap(data, ++i, j);
                cnt++;
                if (cnt == K) {
                    for (int k = 0; k < N; k++) {
                        arr.add(data[k]);
                    }
                }
            }
        }

        if (i + 1 != right) {
            swap(data, i + 1, right);
            cnt++;
            if (cnt == K) {
                for (int k = 0; k < N; k++) {
                    arr.add(data[k]);
                }
            }
        }

        return i + 1;
    }

    public static void quick_sort(int[] data, int left, int right) {
        if (left < right) {
            int p = partition(data, left, right);
            quick_sort(data, left, p - 1);
            quick_sort(data, p + 1, right);
        }
    }

    public static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;
        
        stk = new StringTokenizer(br.readLine());
        N = Integer.parseInt(stk.nextToken());
        K = Integer.parseInt(stk.nextToken());

        int[] data = new int[10000];

        stk = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(stk.nextToken());
            data[i] = num;
        }
        
        quick_sort(data, 0, N - 1);
        
        if (K > cnt) {
            System.out.println("-1");
            return;
        }
        
        for (int i = 0; i < N; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
}
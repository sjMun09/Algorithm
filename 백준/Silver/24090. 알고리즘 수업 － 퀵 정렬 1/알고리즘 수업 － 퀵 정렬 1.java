import java.io.*;
import java.util.*;

public class Main {
    static int N, K, cnt = 0, a, b;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int[] data = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            data[i] = Integer.parseInt(st.nextToken());
        }

        quickSort(data, 0, N - 1);

        if (K > cnt) {
            System.out.println(-1);
        } else {
            if (a < b) {
                System.out.println(a + " " + b);
            } else {
                System.out.println(b + " " + a);
            }
        }
    }

    static int partition(int[] data, int left, int right) {
        int pivot = data[right];
        int i = left - 1;

        for (int j = left; j <= right - 1; j++) {
            if (data[j] <= pivot) {
                i++;
                swap(data, i, j);
                cnt++;
                if (cnt == K) {
                    a = data[i];
                    b = data[j];
                }
            }
        }
        if (i + 1 != right) {
            swap(data, i + 1, right);
            cnt++;
            if (cnt == K) {
                a = data[i + 1];
                b = data[right];
            }
        }
        return i + 1;
    }

    static void quickSort(int[] data, int left, int right) {
        if (left < right) {
            int p = partition(data, left, right);
            quickSort(data, left, p - 1);
            quickSort(data, p + 1, right);
        }
    }

    static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
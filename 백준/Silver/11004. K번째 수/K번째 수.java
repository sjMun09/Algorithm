import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        // quick sorting
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int K = Integer.valueOf(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        // input
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        quicksort(arr, 0, N - 1, K - 1);
        System.out.print(arr[K-1]);
    }
    private static void quicksort(int[]arr, int S,int E,int K) {
        if (S < E) {
            int pivot = partition(arr, S, E);
            if (pivot==K) return;
            else if (K<pivot) quicksort(arr, S, pivot - 1, K);
            else quicksort(arr, pivot + 1, E, K);
        }
    }

    private static int partition(int[] arr, int S, int E) {
        if (S + 1 == E) {
            if(arr[S]>arr[E]) swap(arr, S, E);
            return E;
        }
        int T = (S + E) / 2;
        swap(arr,S,T);
        int pivot = arr[S];
        int i = S + 1, j = E;
        while (i <= j) {
            while (pivot < arr[j] && j > 0) {
                j--;
            }
            while (pivot > arr[i] && i < arr.length - 1) {
                i++;
            }
            if (i <= j) {
                swap(arr, i++, j--);
            }
        }
        arr[S] = arr[j];
        arr[j] = pivot;
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        // sorting
        int index = arr[i];
        arr[i] = arr[j];
        arr[j] = index;
    }
}

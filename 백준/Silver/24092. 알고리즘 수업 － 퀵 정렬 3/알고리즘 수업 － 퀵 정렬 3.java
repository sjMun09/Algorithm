import java.io.*;

public class Main {
    static int N;
    static int[] A;
    static int[] B;
    static boolean result = false;
    static int diff;

    public static int different() {
        for (int i = 0; i < N; i++) {
            if (A[i] != B[i]) {
                return i;
            }
        }
        return -1;  // false
    }

    public static void swap(int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
        if (diff == i || diff == j) {
            diff = different();
            if (diff == -1) {
                result = true;
            }
        }
    }

    public static int partition(int p, int r) {
        int x = A[r];
        int i = p - 1;

        for (int j = p; j <= r - 1; j++) {
            if (A[j] <= x) {
                swap(++i, j);
            }
        }

        swap(i + 1, r);
        return i + 1;
    }

    public static void quick_sort(int p, int r) {
        if (p < r && !result) {
            int q = partition(p, r);
            quick_sort(p, q - 1);
            quick_sort(q + 1, r);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        A = new int[N];
        B = new int[N];

        String[] A_input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(A_input[i]);
        }

        String[] B_input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(B_input[i]);
        }

        diff = different();
        if (diff != -1) {
            quick_sort(0, N - 1);
        } else {
            result = true;
        }

        System.out.println(result ? 1 : 0);
    }
}
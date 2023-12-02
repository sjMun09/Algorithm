import java.io.*;
import java.util.*;

class Main {
    static int[] trees;
    static int start = 0;
    static int end = 0;
    static int result = 0;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        trees = new int[N];
        // input
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            end = Math.max(end, trees[i]); 
        }
      
        while (start <= end) {
            long total = 0;
            int mid = (start + end) / 2;
            for (int i = 0; i < N; i++) {
                if (trees[i] > mid) {
                    total += trees[i] - mid;
                }
            }
            if (total < M) {
                end = mid - 1;
            } else {
                result = mid;
                start = mid + 1;
            }
        }
        System.out.print(result);
    }
}
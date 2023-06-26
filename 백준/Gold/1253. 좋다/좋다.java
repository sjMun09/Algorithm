import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N]; 
        st= new StringTokenizer(br.readLine());
        // input
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        // sort
        Arrays.sort(A);
        int count =0;
        for (int i = 0; i < N; i++) {
            int left = 0;
            int right = N - 1; 
            while (true) {
                if(left == i) left ++;
                else if (right == i) right--;
                if(left>= right) break;
                if(A[left]+A[right] > A[i]) right--;
                else if(A[left]+ A[right]< A[i]) left++;
                else{
                    count++;
                    break;
                }
            }
        }
        System.out.print(count);
    }
}
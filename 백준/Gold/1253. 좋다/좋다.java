import java.util.*;
import java.io.*;

class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N= Integer.parseInt(br.readLine());
        int[] A = new int[N];
        // input
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N;i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        int answer =0;
        for(int i=0; i<N;i++){
            int left =0;
            int right = N-1; // RIGHT index 
            while(true){
                //
                if(left == i) left++;
                else if(right == i) right--;
                // answer 존재 x
                if(left>= right) break;
                if(A[left]+A[right]>A[i]) right--;
                else if(A[left]+A[right]<A[i]) left++;
                else{
                    answer++;
                    break;
                }
            }
        }
        System.out.print(answer);
    }
}
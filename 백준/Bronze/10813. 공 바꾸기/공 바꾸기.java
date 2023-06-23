import java.io.*;
import java.util.*;

class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=i+1;
        }
        for(int j=0; j<M;j++){
            int temp=0;
            st = new StringTokenizer(br.readLine());
            int N2 = Integer.parseInt(st.nextToken());
            int M2 = Integer.parseInt(st.nextToken());
            temp = arr[N2-1];
            arr[N2-1]= arr[M2-1];
            arr[M2-1]= temp;
        }
        br.close();
        for(int print : arr)
            sb.append(print).append("\n");
            System.out.print(sb);
    }
}
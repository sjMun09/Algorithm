import java.util.*;
import java.io.*;

public class Main{
    public static void main(String []args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int [] arrayA = new int [n];
        int [] arrayB = new int [n];
        int sum = 0;
        
        // a
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arrayA[i] = Integer.parseInt(st.nextToken());
        }
        // b
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arrayB[i] = Integer.parseInt(st.nextToken());
        }
        // ST
        Arrays.sort(arrayA); // 오름차순 
        Arrays.sort(arrayB); // 오름차순 정렬
        int [] reverseB = new int [n]; // reverse 
        
        // b 정렬
        for(int i=0; i<n;i++){
            reverseB[i] =arrayB[n-i-1];
        }
        for(int j =0; j<n; j++){
            sum+= arrayA[j] * reverseB[j];
        }
        System.out.print(sum);
        
    }
}

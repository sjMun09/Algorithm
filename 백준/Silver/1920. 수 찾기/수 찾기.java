import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n1 = Integer.parseInt(br.readLine());
        int [] arr1 = new int[n1];
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i< arr1.length;i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr1);
        
        
        int n2 = Integer.parseInt(br.readLine());
        int [] arr2 = new int[n2];
        st = new StringTokenizer(br.readLine()," ");
        for(int j=0; j<arr2.length;j++){
            arr2[j]= Integer.parseInt(st.nextToken());
        }
        
        for(int k=0; k<arr2.length;k++){
            int idx = Arrays.binarySearch(arr1, arr2[k]);
            if( idx>=0)System.out.print("1\n");
            else System.out.print("0\n");
        }
        
    }
}
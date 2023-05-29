import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[]args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n  = Integer.parseInt(br.readLine());
        int [] divisors = readDivisors(br,n);
        long result = findOriginalNuber(divisors);
        System.out.print(result);
    }
    
    public static int[] readDivisors(BufferedReader br,int n)throws IOException{
        int [] divisors = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0; i<n;i++){
            divisors[i] = Integer.parseInt(st.nextToken());
        }
        return divisors;
    }
    
    public static long findOriginalNuber(int[] divisors){
        Arrays.sort(divisors);
        return (long)divisors[0]*divisors[divisors.length-1];
    }
    
}
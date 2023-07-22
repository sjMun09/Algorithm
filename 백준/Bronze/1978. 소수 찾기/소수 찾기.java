import java.io.*;
import java.util.*;

class Main{
    static boolean[] primeNumber;
    
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        etoche();
        int cnt =0;
        for(int i =0; i<N;i++){
            int num = Integer.parseInt(st.nextToken());
            if(isPrime(num)) cnt++;
        }
        System.out.print(cnt);
    }
    private static void etoche(){
        primeNumber = new boolean[1001];
        primeNumber[0] = primeNumber[1] = true;
        
        for(int i=2;i<=Math.sqrt(1000);i++){
            if(!primeNumber[i]){
                for(int j=i*i ; j<primeNumber.length; j+=i)
                    primeNumber[j]= true;
            }
        }
    }
    private static boolean isPrime(int n){
        return !primeNumber[n];
    }
}
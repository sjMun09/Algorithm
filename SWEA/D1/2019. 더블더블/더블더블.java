import java.io.*;
 
public class Solution { 
    public static void main(String[] args) throws IOException {     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int x=1;
         
        for(int i=0; i<N+1; i++) {
            System.out.print(x+" ");
            x*=2;
        }
    }
}
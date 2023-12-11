import java.io.*;
import java.util.*;
class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        
        if(x > y)System.out.print(x+y);
        else System.out.print(y-x);
    }
}
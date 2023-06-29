import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n%2==0) System.out.print(n+" is even");
        else  System.out.print(n+" is odd");
    }
}
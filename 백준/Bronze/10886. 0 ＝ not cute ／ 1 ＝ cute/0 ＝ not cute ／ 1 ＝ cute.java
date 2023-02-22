import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count =0;
        
        for(int i=0;i<N;i++){
            int A= Integer.parseInt(br.readLine());
             if ( A == 0) {
                count++;
            } else if (A == 1) {
               count--;
            }
        }
           

        if (count>0) {
            System.out.print("Junhee is not cute!");
        }else if (count<0){
            System.out.print("Junhee is cute!");
        }
    }
}

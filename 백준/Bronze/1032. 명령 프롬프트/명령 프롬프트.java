import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
        
        String[] FN = new String[n]; // input
        
        for(int i=0;i<n;i++){
            FN[i]=br.readLine();
        }
        
        for(int j=0;j<FN[0].length();j++){
            char ch = FN[0].charAt(j);
            boolean isSame =true;
            
            for(int k=1;k<n;k++){
                if(ch!=FN[k].charAt(j)){
                    isSame = false;
                    break;
                }
            } 
            if(isSame) sb.append(ch);
                else sb.append("?");
        }
        System.out.print(sb);
    }
}
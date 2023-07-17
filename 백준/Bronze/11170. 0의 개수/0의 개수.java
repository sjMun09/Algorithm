import java.io.*;
import java.util.*;

class Main{
    public static void main(String[]args )throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int cnt = 0;
           for(int j= n;j<=m;j++){
               char[] numChars = String.valueOf(j).toCharArray();
               for(char numChar : numChars){
                   if(numChar =='0'){
                       cnt++;
                   }
               }
           }
            System.out.println(cnt);
        }
    }
}
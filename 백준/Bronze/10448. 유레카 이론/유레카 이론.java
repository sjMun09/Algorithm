import java.util.*;
import java.io.*;

class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int k = Integer.parseInt(br.readLine());
        for(int i=0;i<k;i++){
            int T = Integer.parseInt(br.readLine());
            sb.append(gauss(T)).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
    public static int gauss(int num){
        for(int i=1;ThreeNum(i)<num;i++){
             for(int j=1;ThreeNum(j)<num;j++){
                  for(int k=1;ThreeNum(k)<num;k++){
                       if(ThreeNum(i)+ThreeNum(j)+ThreeNum(k)== num) return 1;
                 }
             }
        }
        return 0;
    }
    
    public static int ThreeNum(int n){
        return n* (n+1) /2;
    }
}
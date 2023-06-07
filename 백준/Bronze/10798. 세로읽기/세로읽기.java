import java.util.*;
import java.io.*;

class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        char [][] ch = new char[5][15];
        int maxLength = 0;
        
        for(int i=0; i<ch.length;i++){
            String str = br.readLine();
            if(maxLength < str.length()) maxLength = str.length();
            
            for(int j=0;j<str.length();j++){
                ch[i][j] = str.charAt(j);
            }
        }
        
        for(int i=0;i<maxLength;i++){
            for(int j=0; j<5;j++){
                if(ch[j][i] == '\0') continue;
                sb.append(ch[j][i]);
            }
        }
        bw.write(sb+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
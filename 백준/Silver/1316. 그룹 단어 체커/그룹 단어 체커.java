import java.util.*;
import java.io.*;

class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        // input
        for(int i =0;i<N;i++){
            String word = br.readLine();
            if(checkingWords(word)) count++;
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
    public static boolean checkingWords( String word){
        boolean[] alphabet = new boolean[26]; // EJOTY
        for(int i =0; i<word.length();i++){
            char currentChar = word.charAt(i);
            if(!alphabet[currentChar-'a']){
                alphabet[currentChar-'a']= true; // 표시
                while(i+1<word.length()&&word.charAt(i)== word.charAt(i+1)){
                    i++;
                }
            }else return false;
        }return true;
    }
}
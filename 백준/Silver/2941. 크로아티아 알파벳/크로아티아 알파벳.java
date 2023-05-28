import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        // Croatia 
        String[] changeCroatianAlphabets = {"c=","c-","dz=","d-" ,"lj" ,"nj","s=","z="};
        for(String croatianAlphabet : changeCroatianAlphabets)
            str = str.replace(croatianAlphabet, "*");
        
        System.out.print(str.length());
    }
}
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int A,B,C;
        if((T % 300 % 60 % 10) == 0){
            A = T / 300;
            B = (T % 300) / 60;
            C = ((T % 300) % 60) / 10;
            bw.write(A +" "+ B +" "+ C);
        }else{
            bw.write("-1");
        }
        bw.flush();
        bw.close();
    }
}

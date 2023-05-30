import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int range = 1;
        int temp = 1;

        while (temp < N) {
            temp = temp + (count * 6);
            range++;
            count++;
        }

        bw.write(Integer.toString(range));
        bw.newLine(); // 결과값 출력이후, 줄바꿈
        bw.flush();
        bw.close();
        br.close();
        
    }
}


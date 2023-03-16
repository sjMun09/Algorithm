import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < 7; i++) {
            // 슷자가 더 크다면 descending 은 안됨.
            if (arr[i+1]>arr[i]) descending = false;
            // 슷자가 더 크다면 ascending 은 안됨.
            else if (arr[i+1]<arr[i]) ascending = false;
        }
        if (ascending) {
            System.out.println("ascending");
        } else if (descending) {
            System.out.println("descending");
        }else System.out.println("mixed");
    }
}


import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int youngFare = 0;
        int minFare = 0;

        for (int i = 0; i < N; i++) {
            int second = Integer.parseInt(st.nextToken());
            youngFare += ((second / 30) + 1) * 10;
            minFare += ((second / 60) + 1) * 15;
        }
        if (minFare > youngFare) {
            System.out.print("Y"+" "+youngFare);
        } else if (minFare < youngFare) {
            System.out.print("M"+" "+minFare);
        } else if (minFare == youngFare) {
            System.out.print("Y"+" "+"M"+" "+minFare);
        }
    }
}

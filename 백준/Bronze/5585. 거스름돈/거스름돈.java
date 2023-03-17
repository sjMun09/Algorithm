import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int dollar = 1000;
        int total;
        total = dollar - n;
        int count=0;
        if (total / 500 > 0) {
            count++;
        }
        if ((total % 500)/100 >0) {
            count += (total % 500) / 100;
        }
        if (((total % 500) % 100) / 50 > 0) {
            count += ((total % 500) % 100) / 50;
        }
        if ((((total % 500) % 100) % 50) / 10 > 0) {
            count += (((total % 500) % 100) % 50) / 10;
        }
        if (((((total % 500) % 100) % 50) % 10) / 5 > 0) {
            count += ((((total % 500) % 100) % 50) % 10) / 5;
        }
        if ((((((total % 500) % 100) % 50) % 10) % 5)/1 > 0) {
            count += (((((total % 500) % 100) % 50) % 10) % 5) / 1;
        }
        System.out.println(count);
    }
}


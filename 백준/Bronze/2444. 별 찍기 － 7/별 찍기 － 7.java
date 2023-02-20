import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < i*2-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 2 ; i <= n; i++) {
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = (2*n)-(i*2-1); k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}

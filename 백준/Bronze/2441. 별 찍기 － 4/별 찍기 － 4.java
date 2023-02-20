import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {

            for(int j=N-i; j<N; j++) {
                System.out.print(" ");
            }

            for(int k=i; k<N; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

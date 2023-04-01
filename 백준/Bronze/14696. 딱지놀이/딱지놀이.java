import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    //private static int[][] APT = new int[15][15];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0; i<tc; i++) {
            st = new StringTokenizer(br.readLine());
            int acnt = Integer.parseInt(st.nextToken());
            int[] a = new int[5];
            for (int j = 0; j < acnt; j++){
                a[Integer.parseInt(st.nextToken())]++;
            }
            st = new StringTokenizer(br.readLine());
            int bcnt = Integer.parseInt(st.nextToken());
            int[] b = new int[5];
            for (int j = 0; j < bcnt; j++){
                b[Integer.parseInt(st.nextToken())]++;
            }

            for(int k=4; k>=1; k--) {
                if(a[k]>b[k]) {
                    System.out.println("A");
                    break;
                }
                else if(a[k]<b[k]) {
                    System.out.println("B");
                    break;
                }
                else if(a[k]==b[k]&&k==1) {
                    System.out.println("D");
                    break;
                }
            }
        }
    }
}


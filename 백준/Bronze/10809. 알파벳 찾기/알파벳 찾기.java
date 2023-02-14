import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= -1;
        }
        String s = sc.nextLine(); //엔터 치기 전까지 받음

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (arr[ch - 'a'] == -1) {
                arr[ch - 'a'] =i;
            }
        }
        for (int var : arr) {
            System.out.print(var + " ");
        }
    }
}

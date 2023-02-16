import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] score = new int[4];
        int S = 0;
        int T = 0;

        for (int i = 0; i < 4; i++) {
            score[i] = Integer.parseInt(st.nextToken());
            S += score[i];
        }
        st = new StringTokenizer(br.readLine()," ");
        for (int j = 0; j < 4; j++) {
            score[j] = Integer.parseInt(st.nextToken());
            T += score[j];
        }
        System.out.print(Math.max(S,T));
    }
}
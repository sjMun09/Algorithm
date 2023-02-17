import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int[] arr = new int[N];
        int temp = 0;
        while(st.hasMoreTokens()) {
            arr[temp] = Integer.parseInt(st.nextToken());
            temp++;
        }

        Arrays.sort(arr);
        System.out.print(arr[0] + " " + arr[N - 1]);
    }
}
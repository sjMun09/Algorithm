import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int[] arr1 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine()," ");
        int[] arr2 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine()," ");
        int[] arr3 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        int x;
        int y;
//          x
        if (arr1[0] == arr2[0]) {
            x = arr3[0];
        } else if (arr1[0] == arr3[0]) {
            x = arr2[0];
        } else {
            x = arr1[0];
        }
//          y
        if (arr1[1] == arr2[1]) {
            y = arr3[1];
        }
        else if (arr1[1] == arr3[1]) {
            y = arr2[1];
        } else {
            y = arr1[1];

        }
        System.out.println(x+" "+y);

    }
}

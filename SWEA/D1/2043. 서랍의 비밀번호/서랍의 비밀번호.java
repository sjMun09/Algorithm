import java.util.*;
import java.io.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int pw = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.print(pw-k+1);

    }
}
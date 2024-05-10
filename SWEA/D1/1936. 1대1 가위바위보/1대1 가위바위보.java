import java.util.*;
import java.io.*;

class Solution{
	public static void main(String args[]) throws Exception	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if ((a % 3) + 1 == b) {
            System.out.print("B");
        } else
            System.out.print("A");
    }
}

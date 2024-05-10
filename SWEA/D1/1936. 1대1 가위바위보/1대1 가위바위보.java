import java.util.*;
import java.io.*;

class Solution{
	public static void main(String args[]) throws Exception	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a == 1 && b == 3 || a == 2 && b == 1 || a == 3 && b == 2) {
            System.out.print("A");
        }else System.out.print("B");
	}
}
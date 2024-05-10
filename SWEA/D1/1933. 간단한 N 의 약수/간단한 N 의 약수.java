import java.util.*;
import java.io.*;

class Solution{
	public static void main(String args[]) throws Exception	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        /*
        오름차순 ,내림차순 : https://doitdoik.tistory.com/87
        약수 알고리즘 참고 : https://woodadada16.tistory.com/24
        */
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) System.out.print(i + " ");
        }
    }
}

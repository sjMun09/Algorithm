import java.io.*;
import java.util.*;


public class Solution {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int []arr; 
		StringTokenizer st;
		
		for(int i=0;i<T;i++) {
			int sum=0;
			arr = new int[10];
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<10;j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				if(arr[j]%2!=0)
				sum += arr[j];
			}
			System.out.println("#"+(i+1)+" "+sum);
		}
	}
}
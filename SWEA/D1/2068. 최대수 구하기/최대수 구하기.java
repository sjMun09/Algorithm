

import java.io.*;
import java.util.*;


public class Solution {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int arr[]= new int[10];
		
		for(int k=0;k<N;k++) {
			int max=0;
			st = new StringTokenizer(br.readLine());
			
			for(int i=0;i<10;i++) {
				arr[i]= Integer.parseInt(st.nextToken());
				if(max < arr[i]) {
					max = arr[i];
				}
			}
			System.out.println("#"+(k+1)+" "+ max);
		}
		
	}
}
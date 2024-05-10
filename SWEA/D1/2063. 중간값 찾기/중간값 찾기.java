

import java.io.*;
import java.util.*;


public class Solution {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[]= new int[N];
		for(int i=0;i<N;i++) {			
			arr[i]= Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		System.out.print(arr[N/2]);	
		/*
		 * 간만에 알고리즘을 공부하면서 문제를 푸니 이런 간단한 실수를 하게 되었다. 인덱스는 0번부터 시작이라는 것을 말이다.
		 * 이 배열에서 중앙값은 인덱스 4에 위치합니다. N/2는 9를 2로 나눈 몫이므로 결과적으로 4가 됩니다. 따라서, 9개의 요소가 있는 배열에서 중앙값은 인덱스 4의 요소, 즉 N/2 인덱스에 위치합니다.
		 * 이와 반대로, 만약 N/2+1을 사용한다면, 배열의 인덱스 5의 요소를 참조하게 되어 중앙값이 아닌, 중앙보다 한 칸 뒤의 요소를 참조하게 됩니다. 예를 들어, 9를 2로 나눈 몫에 1을 더하면 5가 되고, 이는 배열의 중앙값보다 한 칸 오른쪽 위치한 값을 의미합니다.
		 * 따라서 배열이 0부터 시작하는 인덱싱을 가지는 언어에서는 중앙값을 N/2로 정확하게 찾을 수 있습니다. 이러한 계산은 배열이 홀수 길이일 때 정확히 중앙값을 가리킵니다. 짝수 길이의 배열에서는 일반적으로 두 중앙 값 중 왼쪽 값을 선택하게 됩니다.
		 */
	}
}
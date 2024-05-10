
import java.io.*;
import java.util.*;


public class Solution {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/*
		 * 각 자릿수를 나눠서 나머지를 더하는 식으로 할꺼임 범위를 10,100,1000 단위로 할 예정.
		 *  각 자릿수를 적절하게 나누기
			a = N / 1000;
			b = (N % 1000) / 100;
			c = (N % 100) / 10;
			d = N % 10;
		 */
		int sum = 0;
		while(true){
			if(N<10) {
				sum=N%10;
				System.out.print(sum);
				break;
			}else if(N<100) {
				//2자릿수니까, 68
				sum= (N/10)+(N%10); // 6+8
				System.out.print(sum);
				break;
			}else if(N<1000) {
				// 3자릿수 678
				sum= (N/100)+((N/10)%10)+(N%10);
				System.out.print(sum);
				break;
			}else if(N<10000) {
				// 4자릿수 6789
				sum= (N/1000)+((N/100)%10)+((N/10)%10)+(N%10);
				System.out.print(sum);
				break;
			}else break;
		}
	}
}
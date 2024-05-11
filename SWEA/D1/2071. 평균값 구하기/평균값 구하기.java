
import java.io.*;
import java.util.*;


public class Solution {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			int sum=0;
			for(int j=0;j<10;j++) {
				sum+= Integer.parseInt(st.nextToken());
			}
			// System.out.println("#"+(i+1)+" "+Math.round(sum/10));
			/* Java 코드에서 평균값을 계산할 때 실수로 인해 발생한 오류를 확인할 수 있습니다. 문제의 요구 사항대로 평균을 계산하려면 실수로 계산한 후 반올림을 해야 합니다. 그러나 코드에서는 정수 나눗셈을 수행하여 소수점 이하를 잘라내고 있기 때문에, 이것이 잘못된 결과를 초래할 수 있습니다.
			 * Java에서 정수 나눗셈은 나눗셈 결과의 소수점 이하를 버립니다. 이를 해결하려면 나눗셈을 수행하기 전에 피연산자 중 하나를 실수형으로 형 변환해야 합니다.
			 */
			 // 나눗셈 전에 sum을 double로 캐스팅하고, 결과를 반올림
            System.out.println("#" + (i + 1) + " " + Math.round(sum / 10.0)); // 10.0으로 나눔
			
		}		
	}
}
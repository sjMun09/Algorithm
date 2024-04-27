import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		//럭키 스트레이트
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] n = br.readLine().toCharArray();//점수
		int half = n.length / 2;
		
		int sum1 = 0, sum2 = 0;
		for(int i = 0; i < n.length; i++) {
			if(i < half) {
				// 왼쪽 부분의 자릿수의 합 더하기
				sum1 += n[i] - '0';
			}else {
				// 오른쪽 부분의 자릿수의 합 더하기
				sum2 += n[i] - '0';
			}
		}
	
		// 왼쪽 부분과 오른쪽 부분의 자릿수 합이 동일한지 검사
		if(sum1 == sum2) {
			System.out.println("LUCKY");
		}else {
			System.out.println("READY");
		}
		
		br.close();
	}

}
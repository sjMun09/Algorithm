import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		//쌍의 갯수
		int count = 0;
		int A, B;
		
		for(int i = 1; i < 501; i++) {
			B = i;
			//B제곱에 N을 더한 값을 루트한다. Math.sqrt
			A = (int) Math.sqrt((B * B) + N);
			
			//한 쌍을 찾았으면 count변수에 저장 1 추가
			if((A * A) - N == B * B) {
				count++;
			}
		}
		System.out.println(count);
	}

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		int count = 0;
        //조건에 맞는 값들을 구하기위한 배열
		int[] arr = new int[N + 1];
		
        //0이면 조건에 맞지않는 값, 1이면 조건에 맞는 값(우선 다 1대입,
        //0인덱스는 조건에 포함되지 않기 때문에 제외해도됨)
		for(int i = 1; i <= N; i++) {
			arr[i] = 1;
		}
		
		for(int i = (K + 1); i <= N; i++) {
        //소수인지 판별하기 위한 변수
			boolean decimal = true;
			for(int j = 2; j < i; j++) {
            //실수가 아니면 decimal에 false 저장하고 이미 소수가 아니니 반복문 종료
				if(i % j == 0) {
					decimal = false;
					break;
				}
			}
			//decimal이 true면 실수이기 때문에 해당 값의 배수들의 배열 위치에 0대입
			if(decimal == true) {
				int j = 1;
				while(true) {
					if((i * j) > N) break;
					arr[i * j] = 0;
					j++;
				}
			}
		}
        //조건에 맞는 값은 1이기때문에 1이 들어간 값의 개수를 구함
		for(int i = 1; i <= N; i++) {
			if(arr[i] == 1) count++;
		}
		System.out.println(count);
	}

}
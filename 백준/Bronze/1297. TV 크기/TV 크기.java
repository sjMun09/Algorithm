import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		//빗변과 너비 높이 총 3개의 변수를 입력할 예정이기에 총 3개의 변수를 만들어준다.
		double D = Double.parseDouble(st.nextToken());
		double H = Double.parseDouble(st.nextToken());
		double W = Double.parseDouble(st.nextToken());
		
		//Math.pow는 제곱. Math.sqrt는 루트.
		double pow = Math.pow(D, 2) / (Math.pow(H, 2) + Math.pow(W, 2));
		double sqrt = Math.sqrt(pow);
		
        	//소수점은 버리고 정수로 출력하라 했으니 int 형으로 출력하면 자동으로 버려진다.
		//여기서 필자는 너비와 높이 값을 바로 출력문에서 계산 출력 했지만 따로 int 변수를 만들어
		//변수에서 계산하고 변수를 출력해도 된다.
		System.out.println((int) (sqrt * H) + " " + (int) (sqrt * W));
	}

}
import java.util.*;
import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = st.countTokens();
		int sum = 0;
		for(int i = 0; i < count; i++) {
			sum += Integer.parseInt(st.nextToken());
		}
		System.out.print(sum);
	}

}
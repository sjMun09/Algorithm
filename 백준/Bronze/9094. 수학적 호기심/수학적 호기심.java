import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int count = 0;
			for(int a = 1; a < N; a++) {
				for(int b = (a + 1); b < N; b++) {
					
					if(((a * a) + (b * b) + M) % (a * b) == 0) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}

}
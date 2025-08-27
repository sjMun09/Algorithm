import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0)  System.out.print(" ");
				for (int j = 1; j <= n; j++) {
					System.out.print("*");
					if (j < n) System.out.print(" ");
				}
				if (i < n) System.out.println();
		}
	}
}
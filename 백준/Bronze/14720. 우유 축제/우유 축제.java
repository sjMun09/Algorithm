import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); // 우유 가게 수
		int[] line = new int[N]; // 우유 가게 수 만큼 배열 생성
		int count = 0; // 최대 먹을수 있는 우유 개수
		int next = 0; // 다음으로 먹을 수 있는 우유 종류
		// 처음으로 먹을수 있는 우유는 딸기우유이므로 0으로 초기화해놓음
		for (int i = 0; i < line.length; i++) {
			line[i] = scan.nextInt();// 가게마다 파는 우유 종류 입력 0=딸기우유 1=초코우유 2=바나나우유
		}

		for (int i = 0; i < line.length; i++) {
			if (line[i] == next && next == 0) {
				count++;
				next = 1;
				continue;
			}
			if (line[i] == next && next == 1) {
				count++;
				next = 2;
				continue;
			}
			if (line[i] == next && next == 2) {
				count++;
				next = 0;
				continue;
			}

		}

		System.out.println(count);

	}
}
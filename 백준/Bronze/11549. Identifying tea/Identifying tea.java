import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 차 종류
		int[] arr = new int[5];

		//참가자 정답 입력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// 정답자 카운트해주기
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == T) {
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}

}
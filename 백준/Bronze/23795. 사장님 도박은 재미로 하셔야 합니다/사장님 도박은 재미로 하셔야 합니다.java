import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[1999];
        int sum = 0;

		// 입력된 수(2000개 미만) 배열에 담기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            
			// 배열에 입력된 마지막 수가 -1이면 반복문 탈출
            if (arr[i] == -1) {
                break;
            }
        }
        sc.close();
        
		// 배열의 마지막 값(-1) 포함 입력된 배열의 전체 합 구하기
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            
            // 배열에 입력된 마지막 수가 -1이면 1더해주고 반복문 탈출
            if (arr[i] == -1) {
                sum = sum + 1;
                break;
            }
        }
        System.out.println(sum);
    }
}
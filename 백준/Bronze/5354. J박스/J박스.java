import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 테스트 케이스 수 입력받기 
        int t = scanner.nextInt();
        
        //테스트 케이스 수만큼 for문 반복
        for (int i = 0; i < t; i++) {
            
            //박스 크키 입력받기
            int n = scanner.nextInt();
            
            // 박스 크키 만큼 이중 for문 반복 
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    // 행, 열이 0이거나 n -1 일 경우 박스 외부이므로 # 출력
                    if (j == 0 || j == n - 1 || k == 0 || k == n - 1) {
                        System.out.print("#");
                    } else {
                        System.out.print("J");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
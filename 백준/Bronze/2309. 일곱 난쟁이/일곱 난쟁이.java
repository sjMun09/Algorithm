import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static int[] height = new int[9]; // 9개의 정수를 저장할 배열을 선언합니다.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader를 사용하여 입력을 받습니다.

        int sum = 0; // 일곱 난쟁이의 키의 합을 계산하기 위해 sum 변수를 0으로 초기화합니다.

        for (int i = 0; i < 9; i++) { // 9개의 난쟁이 키를 입력받기 위해 for문을 사용합니다.
            height[i] = Integer.parseInt(br.readLine()); // 입력받은 키를 배열에 저장합니다.
            sum += height[i]; // 입력받은 키를 sum 변수에 더합니다.
        }

        Arrays.sort(height); // 입력받은 키를 오름차순으로 정렬합니다.

        for (int i = 0; i < 9; i++) { // 첫 번째 난쟁이부터 아홉 번째 난쟁이까지 순서대로 탐색합니다.
            for (int j = i + 1; j < 9; j++) { // i 번째 난쟁이와 j 번째 난쟁이를 선택하여 키의 합을 구합니다.
                if (sum - height[i] - height[j] == 100) { // 합이 100인 경우
                    for (int k = 0; k < 9; k++) { // 9명 중에서 2명을 제외한 7명의 키를 출력합니다.
                        if (k != i && k != j) {
                            System.out.println(height[k]);
                        }
                    }
                    System.exit(0); // 프로그램을 종료합니다.
                }
            }
        }
    }
}

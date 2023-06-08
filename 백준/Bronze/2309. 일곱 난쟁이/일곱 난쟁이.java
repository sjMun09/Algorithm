import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int[] height = new int[9];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0; // 일곱 난쟁이의 키의 합
        for (int i = 0; i < 9; i++) {            
height[i] = Integer.parseInt(br.readLine());
            sum += height[i];        }

        Arrays.sort(height); //  오름차순으로 정렬.

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) { // i 번째 난쟁이와 j 번째 난쟁이를 선택하여 키의 합 확인
                if (sum - height[i] - height[j] == 100) { // 합이 100인 경우
                    for (int k = 0; k < 9; k++) { // 9명 중에서 2명을 제외한 7명의 키를 출력
                        if (k != i && k != j) {
                            System.out.println(height[k]);
                        }
                    }
                    return ;
                }
            }
        }
    }
}
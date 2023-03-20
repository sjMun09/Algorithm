import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 의자 7, 접시 7, 나이프 7 , 난쟁이7 광산 일하러갔으나 난쟁이 9이 돌아옴
        // 난쟁이 모자 100이하 7명 난쟁이 모자숫자 합 100
        int sum = 0;
        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        // 비교하는 로직
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                int temp = 0;
                temp = arr[i] + arr[j];
                // 모자 총 숫자 합에서 두 난쟁이의 모자 숫자 합을 빼줬을 때 0 이라면 얘네 둘을 빼면 됨.
                if (sum - temp == 100) {
                    arr[i] = 0;
                    arr[j] = 0;
                    for (int k = 0; k < 9; k++) {
                        if (k != i && k != j) {
                            System.out.println(arr[k]);
                        }
                    }
                }

            }
        }

    }
}


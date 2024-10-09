import java.io.*;
import java.util.*;

class Main {
    /**
     * 1182번, 부분 수열의 합
     * 2s
     */
    static int N,S;
    static int[] arr;
    static int count =0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    /*
    입력 값이 2개 주어진다.
    첫 번째 입력 값은 정수의 개수,
    두 번째 입력 값(S)은 원소를 다 더한 값이 S가 되는 경우의 수
    */

        /*
        풀이1, 일단 다 더하고 나중에 뺴기
        풀이2, 더하는 경우만 더하기 <- 채택
        풀이3, 모든 수열의 경우를 구해서 합을 검증
         */
        /*
        연속되는 수열만 고려하지 않고, 부분수열은 부분집합으로 인지하고 풀기.
         */
        String[] inputInteger = br.readLine().split(" ");
        N = Integer.parseInt(inputInteger[0]);
        S = Integer.parseInt(inputInteger[1]);


        arr = new int[N];
        String[] inputNum = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(inputNum[i]);
        }

        recursive(0, 0);

        if (S ==0) count--;

        System.out.print(count);
    }

    private static void recursive(int index, int sum) {
        if (index == N) {
            if(sum ==S) count++;
            return;
        }

        recursive(index + 1, sum);

        recursive(index + 1, sum + arr[index]);
    }
}

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arrayA = new int[n];
        int [] arrayB = new int [n];
        int sum = 0;
        
        // A 배열에 대한 입력 처리
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arrayA[i] = Integer.parseInt(st.nextToken());
        }
        
        // B 배열에 대한 입력 처리
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arrayB[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arrayA); // 오름차순 소팅
        Arrays.sort(arrayB); // 오름차순 소팅
        int[] reverseB = new int[n]; // 내림차순으로 정렬할 새 배열 생성
        
        // B 배열을 내림차순으로 정렬
        for(int i = 0; i < n; i++) {
            reverseB[i] = arrayB[n - i - 1];
        }

        for (int i = 0; i < n; i++) {
            sum += arrayA[i] * reverseB[i];
        }
        System.out.print(sum);
    }

}

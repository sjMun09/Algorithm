import java.util.Arrays;

public class Solution {
    public int solution(int[] array) {
        int max = 0;
        int index = -1;
        
        // 배열 정렬
        Arrays.sort(array);
        
        // 카운팅 배열 초기화
        int[] count = new int[array[array.length-1]+1];
        
        // 각 수의 index 카운팅
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }
        
        // 최빈값 찾기
        for (int j = 0; j < count.length; j++) {
            if (max < count[j]) {
                max = count[j];
                index = j;  // 최빈값이 바뀔 때의 인덱스 (최빈값)
            } else if (max == count[j]) {
                index = -1; // 최빈값이 여러개인 경우 -1
            }
        }
        
        return index;
    }
}
import java.util.*;

public class Solution {

    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int [2];
        
        answer[0] = (denum1 * num2) + (denum2 * num1);
        answer[1] = num1 * num2;
        
        int min = Math.min(answer[0], answer[1]);
        int max = 1;
        
        for(int i = 1; i <= min; i++) {
            if(answer[0] % i == 0 && answer[1] % i == 0) {
                max = i;
            }
        }
        
        answer[0] /= max;
        answer[1] /= max;
        
        return answer;
    }
    
    public static void main(String[] args) {
        int denum1 = 1;
        int num1 = 2;
        int denum2 = 3;
        int num2 = 4;

        Solution sol = new Solution();
        int[] result = sol.solution(denum1, num1, denum2, num2);
        System.out.println(Arrays.toString(result));
    }
}
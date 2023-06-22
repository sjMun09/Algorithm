import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
//         int[] answer = new int[num_list.length];
//         int[] reverseArr = new int [num_list.length];
        
//         for(int i=answer.length-1,j=0 ; i>=0 ;i--,j++){
//             reverseArr[j]=answer[i];
//         }
//         Arrays.toString(reverseArr);
//         return reverseArr;
        int[] answer = new int[num_list.length];
        for(int i=0;i<num_list.length;i++){
            answer[i]=num_list[num_list.length-i-1]; // length에서 0부터 빼주니까 인덱스 뒤에서부터 읽는거임.
        }
        return answer;
    }
}
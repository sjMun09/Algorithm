class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        // 양꼬치 n, 음료수 k
        if(n/10>0){
            answer = n*12000-2000*(n/10);
        }else answer =n*12000;

        answer += k * 2000;
        return answer;
    }
}
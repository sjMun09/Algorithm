class Solution {
    public double solution(int[] numbers) {
        int answer=0;
        for(int i=0; i<numbers.length;i++){
        answer += numbers[i];
        }
        double avg = (double)answer/numbers.length;
        if(avg %2 == 0|| avg%0.5==0) return avg;
        else return -1;
    }
}
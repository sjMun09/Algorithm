class Solution {
    public int[] solution(int money) {
        int AA = 5500;
        int calc = money/5500;
        int balance = money%5500;
        int[] answer = {calc, balance};
        return answer;
    }
}
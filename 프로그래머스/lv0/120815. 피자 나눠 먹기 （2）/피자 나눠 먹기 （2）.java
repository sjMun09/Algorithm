class Solution {
    public int solution(int n) {
        int pizza=1; //몇 판을 리턴할 지, 1판에 6피스
        
        while(true){
            if(6*pizza %n==0){
                break;
            }
            pizza++;
        }
        return pizza;
    }
}
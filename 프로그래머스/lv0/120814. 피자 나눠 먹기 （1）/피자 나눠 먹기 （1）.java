class Solution {
    public int solution(int n) {
        int answer = 0; // 피자의 수
        
        //answer = (n / 7) + 1;
        
        if (n<8){
            answer = 1;
        }
        
        if  (n%7 == 0)
        {
            answer = n / 7  ;
        }
        
        if (n%7 != 0)
        {
            answer = n / 7 + 1 ;
        }
        
        return answer;
    }
}
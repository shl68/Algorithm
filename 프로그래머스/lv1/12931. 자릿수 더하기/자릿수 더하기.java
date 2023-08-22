import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String a = n + "";
        int b = a.length();
        
      for(int i = 0; i < b; i++) { 
            
          answer += n%10;

          n = n/10;
      }
        
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        //System.out.println(a);
        //System.out.println(b);


        return answer;
     }
}

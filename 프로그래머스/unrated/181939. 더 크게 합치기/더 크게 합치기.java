class Solution {
    public int solution(int a, int b) {
        int answer = 0;               
        //String ab = a + b + ""; int를 문자열로 변환하기 위해 ""를 뒤에 놓은 경우 정수형 덧셈 후 문자열 변환이 됐음.
        //String ba = b + a + "";
        String ab = "" + a + b;
        String ba = "" + b + a;
        int ab1 = Integer.parseInt(ab);
        int ba1 = Integer.parseInt(ba);
        
        System.out.println(ab);

        if (ab1 >= ba1)
        {
            answer = ab1;
        }
        else if (ab1 < ba1)
        {
            answer = ba1;
        }
        return answer;
    }
}
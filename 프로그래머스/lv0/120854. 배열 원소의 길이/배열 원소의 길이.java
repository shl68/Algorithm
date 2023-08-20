class Solution {
    public int[] solution(String[] strlist) {
        
    int x = strlist.length;
    int[] answer = new int[x];

    for(int i = 0; i<strlist.length; i++) 
    {
        answer[i] = strlist[i].length();
    }

    return answer;
    }
}
class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double num = 0;
        int i;
        
        for (i=0;i<numbers.length;i++){
            num += numbers[i];
        }
        
        return num/numbers.length;
    }
}
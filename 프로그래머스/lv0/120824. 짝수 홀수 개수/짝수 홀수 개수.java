
class Solution {
            public int[] solution(int[] num_list) {
                
                int evencount = 0;
                int oddcount = 0;

                for (int i = 0; i<num_list.length; i++)
                {
                    if (num_list[i] % 2 == 0)
                    {
                         evencount++;
                    }

                    else if (num_list[i] % 2 != 0)
                    {
                         oddcount++;

                    }
                }

                 int[] answer = {evencount, oddcount};

                return answer;
            }
        }
    

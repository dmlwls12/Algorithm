import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int sub = 0;
        
        for(int i = 0; i < num_list.length; i++){
            if(num_list[num_list.length - 1] > num_list[num_list.length - 2]){
                sub = num_list[num_list.length - 1] - num_list[num_list.length - 2];
                
                answer = Arrays.copyOf(num_list, num_list.length + 1);
                answer[answer.length - 1] = sub;
            } else {
                sub = num_list[num_list.length - 1] * 2;
                
                answer = Arrays.copyOf(num_list, num_list.length + 1);
                answer[answer.length - 1] = sub;
            }
        }
        return answer;
    }
}
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        
        for(int i = 0; i < arr.length; i++){
            if(!stk.isEmpty() && stk.peek() == arr[i]){
                stk.pop();
            } else{
                stk.push(arr[i]);
            }
        }
        
        if(stk.isEmpty()){
            return new int[]{-1};
        }
        
        int[] result = new int[stk.size()];
        for(int i = stk.size() - 1; i >= 0; i--){
            result[i] = stk.pop();
        }
        
        return result;
    }
}
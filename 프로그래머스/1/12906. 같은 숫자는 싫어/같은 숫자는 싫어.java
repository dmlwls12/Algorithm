import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i : arr){
            if(stack.empty() || !stack.peek().equals(i)){
                stack.push(i);
            }
        }
        
        System.out.println("Hello Java");

        return stack.stream().mapToInt(i -> i).toArray();
    }
}
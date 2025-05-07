import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Set<Integer> set = new LinkedHashSet<>();
        
        for(int n : arr){
            if(set.size() < k){
                set.add(n);
            }
        }
        
        int i = 0;
        for(int n : set){
            answer[i++] = n;
        }
        
        while(i < k){
            answer[i++] = -1;
        }
        return answer;
    }
}
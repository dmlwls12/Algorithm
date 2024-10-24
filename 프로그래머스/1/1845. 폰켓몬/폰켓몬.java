import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int n = nums.length / 2;
        int m = map.size();
        
        answer = n > m ? m : n;
        
        return answer;
    }
}
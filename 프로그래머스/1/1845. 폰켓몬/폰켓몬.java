import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        // 1. nums 중 n/2마리만 가져갈 수 있다.
        // 2. 경우의 수 반환
        
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        
        int answer = nums.length / 2;
        return Math.min(set.size(), answer);
    }
}
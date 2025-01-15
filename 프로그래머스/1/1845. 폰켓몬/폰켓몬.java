import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        
        int answer = nums.length / 2;
        
        HashSet<Integer> numSet = new HashSet<>();
        
        for(int num : nums) {
            numSet.add(num);
        }
        
        if(numSet.size() > answer) {
            return answer;
        } else {
            return numSet.size();
        }
        
    }
}
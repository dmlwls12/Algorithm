import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        List<Integer> list = new ArrayList<>();
        Set<Integer> winSet = new HashSet<>();
        
        int matchCount = 0;
        int zeroCount = 0;
        
        for(int i : win_nums){
            winSet.add(i);
        }
        
        for(int n : lottos){
            if(n == 0){
                zeroCount++;
            } else if(winSet.contains(n)){
                matchCount++;
            }
        }
        
        int maxMatch = matchCount + zeroCount;
        int minMatch = matchCount;
        
        int maxRank = getRank(maxMatch);
        int minRank = getRank(minMatch);
            
        return new int[]{maxRank, minRank};
        
    }
    
    private static int getRank(int match){
            return (match >= 2) ? 7 - match : 6;
        
    }
}
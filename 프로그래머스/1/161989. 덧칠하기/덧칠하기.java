import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        
        if (section == null || section.length == 0) return 0;
        
        Arrays.sort(section);
        int count = 0;
        int last = 0;
        
        for (int s : section) {
            if (s > last) {
                count++;
                last = s + m - 1;
            }
        }
        return count;
    }
}
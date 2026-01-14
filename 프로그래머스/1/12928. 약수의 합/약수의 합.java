import java.util.*;

class Solution {
    public int solution(int n) {
        Set<Integer> set = new HashSet<>();
        for(int i = 1; i <= n; i++){
            if(n % i == 0) set.add(i);
        }
        
        int answer = 0;
        
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()) answer += iterator.next();
        return answer;
    }
}
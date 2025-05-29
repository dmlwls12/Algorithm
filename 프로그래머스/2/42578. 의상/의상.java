import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        
        // 1. Map 이용
        // 2. 종류별로 하나씩만 매칭
        // 경우의 수 반환
        
        Map<String, Integer> map = new HashMap<>();
        
        for(String[] s : clothes){
            String type = s[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        
        int answer = 1;
        for(int count : map.values()){
            answer *= count + 1;
        }
        
        return answer - 1;
    }
}
import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < name.length; i++){
            map.put(name[i], yearning[i]);
        }
        
        for(String[] group : photo){
            int score = 0;
            for(String person : group){
                score += map.getOrDefault(person, 0);
            }
            answer.add(score);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
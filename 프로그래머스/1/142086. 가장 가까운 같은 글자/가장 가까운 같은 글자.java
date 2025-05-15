import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char word = s.charAt(i);
            
            if(map.containsKey(word)){
                answer[i] = i - map.get(word);
            } else{
                answer[i] = -1;
            }
            map.put(word, i);
        }
        return answer;
    }
}
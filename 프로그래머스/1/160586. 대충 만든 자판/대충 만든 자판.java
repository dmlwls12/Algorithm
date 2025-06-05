import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {

        
        Map<Character, Integer> keypad = new HashMap<>();
        int[] answer = new int[targets.length];
        
        for(int i = 0; i < keymap.length; i++){
            for(int j = 0; j < keymap[i].length(); j++){
                char c = keymap[i].charAt(j);
                
                if(keypad.containsKey(c)){
                    int idx = keypad.get(c);
                    keypad.put(c, Math.min(idx, j + 1));
                } else{
                    keypad.put(c, j + 1);
                }
            }
        }
        
        for(int i = 0; i < targets.length; i++){
            String target = targets[i];
            int count = 0;
            boolean flag = true;
            for(char c : target.toCharArray()){
                if(keypad.containsKey(c)){
                    count += keypad.get(c);
                } else{
                    flag = false;
                    break;
                }
            }
            answer[i] = flag == false ? -1 : count;
        }
        return answer;
    }
}
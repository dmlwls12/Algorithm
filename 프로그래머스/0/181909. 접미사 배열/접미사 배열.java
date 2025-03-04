import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> answer = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++){
            String str = my_string.substring(i);
            answer.add(str);
            Collections.sort(answer);
        }
        return answer.stream().toArray(String[]::new);
    }
}
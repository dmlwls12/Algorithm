import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] strArr = new String[my_string.length()];
        
        for(int i = 0; i < my_string.length(); i++){
            strArr[i] = my_string.substring(i);
        }
        
        answer = Arrays.stream(strArr).anyMatch(is_suffix::equals) == true ? 1 : 0;
        return answer;
    }
}
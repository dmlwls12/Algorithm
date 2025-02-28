import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder(my_string);
        
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            
            String sub = answer.substring(s, e + 1);
            String rv = new StringBuilder(sub).reverse().toString();
            answer.replace(s, e + 1, rv);
        }
        
        return answer.toString();
    }
}
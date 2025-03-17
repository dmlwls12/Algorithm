import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] before = {};
        int[] after = {};
        ArrayList<Integer> answer = new ArrayList<>();
        
        before = Arrays.copyOfRange(num_list, 0, n);
        after = Arrays.copyOfRange(num_list, n, num_list.length);
        
        for(int e : after){
            answer.add(e);
        }
        
        for(int i : before){
            answer.add(i);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
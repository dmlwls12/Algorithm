import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int n = l; n <= r; n++){
            if(String.valueOf(n).matches("[05]+")){
                list.add(n);
            }
        }
        
       if(list.isEmpty()) {
            list.add(-1);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
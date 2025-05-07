import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> x = new ArrayList<>();
        
        for(int i = 0; i < flag.length; i++){
            if(flag[i] == true){
                for(int j = 0; j < arr[i] * 2; j++){
                    x.add(arr[i]);
                }
            } else{
                for(int j = 0; j < arr[i]; j++){
                    x.remove(x.size() - 1);
                }
            }
        }
        
        
        return x.stream().mapToInt(Integer::intValue).toArray();
    }
}
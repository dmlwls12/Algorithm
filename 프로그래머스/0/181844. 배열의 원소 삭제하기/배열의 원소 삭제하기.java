import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        
        Set<Integer> deleteSet = new HashSet<>();
        for(int del : delete_list){
            deleteSet.add(del);
        }
        
        for(int n : arr){
            if(!deleteSet.contains(n)){
                list.add(n);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
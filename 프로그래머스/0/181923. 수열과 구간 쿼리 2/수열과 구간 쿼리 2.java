import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            int minValue = Integer.MAX_VALUE;
            boolean found = false;
            
            for(int j = s; j <= e; j++){
                if(k < arr[j]){
                    minValue = Math.min(minValue, arr[j]);
                    found = true;
                }
            }
            
            list.add(found ? minValue : -1);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
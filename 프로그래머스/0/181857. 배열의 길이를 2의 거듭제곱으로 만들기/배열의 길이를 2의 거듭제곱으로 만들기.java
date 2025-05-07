import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int n = arr.length;
        if((n & (n - 1)) == 0) return arr;
        
        int newLength = 1;
        while(newLength < n){
            newLength *= 2;
        }
        return Arrays.copyOf(arr, newLength);
    }
}
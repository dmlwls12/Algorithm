import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int newLength = 1;
        while(newLength < arr.length){
            newLength *= 2;
        }
        return Arrays.copyOf(arr, newLength);
    }
}
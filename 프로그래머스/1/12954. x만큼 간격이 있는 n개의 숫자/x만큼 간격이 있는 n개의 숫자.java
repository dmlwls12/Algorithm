import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        long sum = 0;
        long[] arr = new long[n];
        
        for(int i = 0; i < n; i++){
            sum += x;
            arr[i] = sum;
        }
        return arr;
    }
}
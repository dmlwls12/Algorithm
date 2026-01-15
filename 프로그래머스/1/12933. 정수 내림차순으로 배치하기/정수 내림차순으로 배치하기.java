import java.util.*;

class Solution {
    public long solution(long n) {
        String s = String.valueOf(n);
        long[] arr = new long[s.length()];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = n % 10;
            n /= 10;
        }
        
        Arrays.sort(arr);
        long answer = 0;
        
        for(int i = arr.length - 1; i >= 0; i--){       // 이렇게 하면 뒤부터 반복
            answer = answer * 10 + arr[i];
        }
        
        return answer;
    }
}
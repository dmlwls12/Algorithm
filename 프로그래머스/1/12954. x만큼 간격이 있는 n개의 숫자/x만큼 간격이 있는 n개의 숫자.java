import java.util.stream.*;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = IntStream.range(0, n)
                        .mapToLong(i -> (long)x * (i + 1))
                        .toArray();
        
        return answer;
    }
}
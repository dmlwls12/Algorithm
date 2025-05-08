import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list) {
        
        List<Integer> answer = Arrays.stream(num_list)
                                    .boxed()
                                    .sorted()
                                    .collect(Collectors.toList())
                                    .subList(5, num_list.length);
                
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
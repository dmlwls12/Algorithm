import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        while(n != 1){
            list.add(n);
            n = n % 2 == 0 ? n / 2 : 3 * n + 1;     // 변수를 n으로 두고 풀어야 하는데, 엉뚱한 reslut로 두고 품!
        }
    list.add(1);
    return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
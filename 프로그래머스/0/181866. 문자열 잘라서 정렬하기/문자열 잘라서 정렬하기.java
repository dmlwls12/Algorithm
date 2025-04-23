import java.util.*;

class Solution {
    public String[] solution(String myString) {
        List<String> list = new ArrayList<>(Arrays.asList(myString.split("x+")));
        
        list.removeIf(s -> s.equals(""));
        Collections.sort(list);
        
        return list.toArray(new String[0]);
    }
}
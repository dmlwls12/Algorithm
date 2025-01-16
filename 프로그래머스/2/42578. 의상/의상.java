import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        
        int answer = 1;
        
        HashMap<String, Integer>  closet = new HashMap<>();
        
        for(String[] setUp : clothes){
            String type = setUp[1];
            closet.put(type, closet.getOrDefault(type, 0) + 1);
        }
        
        for(int count : closet.values()){
            answer *= (count + 1);
        }
        return answer - 1;
    }
}
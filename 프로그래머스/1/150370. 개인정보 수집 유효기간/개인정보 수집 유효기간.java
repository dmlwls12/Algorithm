import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        Map<String, Integer> termsMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(String s : terms){      // termsMap 완성
            String[] part = s.split(" ");
            int label = Integer.parseInt(part[1]);
            termsMap.put(part[0], label);     
        }
        
        String[] part = today.split("\\.");       // today 날짜 파싱
        int t_year = Integer.parseInt(part[0]);
        int t_mon = Integer.parseInt(part[1]);
        int t_day = Integer.parseInt(part[2]);
        
        for(int i = 0; i < privacies.length; i++){
            String[] parts = privacies[i].split(" ");       // privacies 파싱
            String label = parts[1];
            String date = parts[0];
            
            String[] datePart = date.split("\\.");       // 날짜 파싱
            int p_year = Integer.parseInt(datePart[0]);
            int p_mon = Integer.parseInt(datePart[1]);
            int p_day = Integer.parseInt(datePart[2]);
            
            p_mon += termsMap.get(label);     // terms 더하기
            
            while(p_mon > 12){
                p_mon -= 12;
                p_year++;
            }
            
            p_day -= 1;       // 기한은 전날까지이니 하루 빼기
            
            if(p_day < 1){
                p_day = 28;
                p_mon --;
                
                if(p_mon < 1){
                    p_mon = 12;
                    p_year--;
                }
            }
            
            if(t_year > p_year || t_mon > p_mon && t_year == p_year || t_day > p_day && t_mon == p_mon && t_year == p_year) list.add(i + 1);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();

    }
}
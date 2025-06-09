import java.util.*;
import java.time.*;
import java.time.format.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {

        List<Integer> list = new ArrayList<>();
        Map<String, Integer> t_map = new HashMap<>();
        Map<String, String> p_map = new HashMap<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate todayDate = LocalDate.parse(today, formatter);
        
        int t_year = todayDate.getYear();
        int t_mon = todayDate.getMonthValue();
        int t_day = todayDate.getDayOfMonth();
        
        // terms의 map
        for(int i = 0; i < terms.length; i++){
            String[] parts = terms[i].split(" ");
            t_map.put(parts[0], Integer.parseInt(parts[1]));
        }
        
        // privacies의 map
        for(int i = 0; i < privacies.length; i++){
            String[] parts = privacies[i].split(" ");
            String dateStr = parts[0];
            String type = parts[1];
            
            String[] dateParts = dateStr.split("\\.");
            int year = Integer.parseInt(dateParts[0]);
            int month = Integer.parseInt(dateParts[1]);
            int day = Integer.parseInt(dateParts[2]);
            
            month += t_map.get(type);
            
            while(month > 12){
                year++;
                month -= 12;
            }
            
            day -= 1;
            if(day < 1){
                month--;
                day = 28;
                if(month < 1){
                    year--;
                    month = 12;
                }
            }
            
            if(year < t_year || (year == t_year && month < t_mon) || (year == t_year && month == t_mon && day < t_day)){
                list.add(i + 1);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
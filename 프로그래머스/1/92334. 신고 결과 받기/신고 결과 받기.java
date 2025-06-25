import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        Map<String, Integer> map = new HashMap<>();
        
        // report에서 신고당한 사람 신고 횟수 세기
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));        
        Map<String, Integer> reportCount = new HashMap<>();     // 신고당한 사람, 횟수
        Map<String, Integer> mailCount = new HashMap<>();       // 신고한 사람, 메일 수
        int[] answer = new int[id_list.length];
        
        for(String s : reportSet){
            String[] parts = s.split(" ");
            String reported = parts[1];
                        
            reportCount.put(reported, reportCount.getOrDefault(reported, 0) + 1);
        }
        
        for(String s : reportSet){
            String[] parts = s.split(" ");
            String reporter = parts[0];
            String reported = parts[1];
            
            if(reportCount.getOrDefault(reported, 0) >= k){
                mailCount.put(reporter, mailCount.getOrDefault(reporter, 0) + 1);
            }
        }
        
        for(int i = 0; i < id_list.length; i++){
            answer[i] = mailCount.getOrDefault(id_list[i], 0);
        }
        
        return answer;
    }
}
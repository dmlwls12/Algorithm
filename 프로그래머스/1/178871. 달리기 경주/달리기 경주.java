import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rankMap = new HashMap<>();
        Map<Integer, String> nameMap = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            rankMap.put(players[i], i);
            nameMap.put(i, players[i]);
        }
        
        for (String call : callings) {
            int curRank = rankMap.get(call);
            if (curRank == 0) continue;
            
            int frontRank = curRank - 1;
            String frontPlayer = nameMap.get(frontRank);
            
            rankMap.put(call, frontRank);
            rankMap.put(frontPlayer, curRank);
            
            nameMap.put(frontRank, call);
            nameMap.put(curRank, frontPlayer);
        }
        
        String[] result = new String[players.length];
        for (int i = 0; i < players.length; i++) {
            result[i] = nameMap.get(i);
        }
        return result;
    }
}
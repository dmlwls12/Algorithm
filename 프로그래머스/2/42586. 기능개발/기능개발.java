import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        Queue<Integer> que = new LinkedList<>();
        
        for(int i = 0; i < progresses.length; i++){
        
            int rest = 100 - progresses[i];
            
            if(rest % speeds[i] == 0){
                que.offer(rest/speeds[i]);
            }
            else{
                que.offer(rest/speeds[i] + 1);
            }
        } 
        
        List<Integer> list = new ArrayList<>();
        
        while(!que.isEmpty()){
            int currentDay = que.poll();
            int count = 1;
            
            while(!que.isEmpty() && que.peek() <= currentDay) {
                que.poll();
                count++;
            }
            list.add(count);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        // 1. k일까지의 출연자 점수 명예의 전당에 올리기
        // 2. k일 후부터 명예의 전당의 점수와 비교하여 높은 점수를 명예의 전당에 올리기
        // 3. score의 길이만큼 점수 올리기를 반복하면서, 그 중 가장 낮은 수들을 배열에 담아 반환하기
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i < score.length; i++){
            if(pq.size() < k){
                pq.add(score[i]);
            } else if(pq.peek() < score[i]){
                pq.poll();
                pq.add(score[i]);
            }
            
            answer[i] = pq.peek();
        }
        return answer;
    }
}
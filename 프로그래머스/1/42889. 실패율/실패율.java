import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        
        // N : 스테이지 개수
        // stages[] : 사용자가 현재 멈춰있는 스테이지의 번호
        
        // 클리어 못한 플레이어 수
        int[] stay = new int[N + 2];
        for(int s : stages){
            if(1 <= s && s <= N + 1) stay[s]++;
        }
        
        int total = stages.length;      // 1단계 도달 인원
        
        List<int[]> order = new ArrayList<>();
        double[] fail = new double[N + 1];      // 실패율 저장
        
        for(int stage = 1; stage <= N; stage++){
            int notClear = stay[stage];     // 해당 스테이지 실패한 플레이어 수
            double rate = (total == 0) ? 0.0 : (double) notClear / total;
            fail[stage] = rate;
            order.add(new int[]{stage});
            total -= notClear;
        }
        
        // 실패율 내림차순, 동률이면 스테이지 번호 오름차순
        order.sort((a,b) -> {
            int sa = a[0], sb = b[0];
            if(fail[sb] > fail[sa]) return 1;
            if(fail[sb] < fail[sa]) return -1;
            return Integer.compare(sa, sb);
        });
        
        int[] result = new int[N];
        for (int i = 0; i < N; i++) result[i] = order.get(i)[0];
        return result;
    }
}
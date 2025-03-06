class Solution {
    public int[] solution(int n, int k) {
        int index = n / k;
        int[] answer = new int[index];
        
        int idx = 0;
        for(int i = 1; i <= n; i++){
            if(i % k == 0){
                answer[idx++] = i;
            }
        }
        return answer;
    }
}
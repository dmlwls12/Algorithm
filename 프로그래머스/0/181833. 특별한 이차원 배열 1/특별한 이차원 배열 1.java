class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        for(int i = 0; i < answer.length; i++){
            for(int j = i; j < answer[0].length; j+=n){
                answer[i][j] = 1;
            }
        }
        return answer;
    }
}
class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for(int i = 1; i < numLog.length; i++){     // 1부터 시작해야 함. 0번째는 초기값 0이기 때문.
            
            int n = numLog[i] - numLog[i - 1];
            
            switch(n){
                case 1:
                    answer += "w";
                    break;
                    
                case -1:
                    answer += "s";
                    break;
                    
                case 10:
                    answer += "d";
                    break;
                    
                case -10:
                    answer += "a";
                    break;
            }
        }
        return answer;
    }
}

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int n = t.length() - p.length() + 1;
        
        // 1. 문자열을 어떻게 p글자씩 나눌것이냐
        // 2. 부분 문자열과 p 크기 비교
        
        for(int i = 0; i < n; i++){
            String s = t.substring(i, i + p.length());
            
            if(Long.parseLong(s) <= Long.parseLong(p)) answer ++;
        }
        return answer;
    }
}
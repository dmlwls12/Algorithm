class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        for(char c : num_str.toCharArray()){
            // answer += Character.getNumericValue(c);
            answer += c - '0';
        }
        return answer;
    }
}
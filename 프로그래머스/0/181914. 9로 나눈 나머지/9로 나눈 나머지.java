class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        
        for(int i = 0; i < number.length(); i++){
            int n = Character.getNumericValue(number.charAt(i));
            sum += n;
            answer = sum % 9;
        }
        return answer;
    }
}
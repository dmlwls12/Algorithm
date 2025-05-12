class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int index = 0;
        
        for(String s : picture){
            String str = "";
            
            for(char c : s.toCharArray()){
                str += String.valueOf(c).repeat(k);
            }
            
            for(int i = 0; i < k; i++){
                answer[index++] = str;
            }
        }
        return answer;
    }
}
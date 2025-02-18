class Solution {
    public String solution(String code) {
        StringBuilder b = new StringBuilder();
        boolean mode = true;
        
        for(int i = 0; i < code.length(); i++){
            char c = code.charAt(i);
            
            if(c == '1'){
                mode = !mode;
            } else {
                if(mode == (i % 2 == 0)){
                    b.append(c);
                }
            }
        }
        String answer = b.length() == 0 ? "EMPTY" : b.toString();
        return answer;
    }
}
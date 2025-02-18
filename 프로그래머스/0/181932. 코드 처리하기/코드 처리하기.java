class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        
        for(int idx = 0; idx < code.length(); idx++){
            if(code.charAt(idx) == '1'){
                mode = 1 - mode;
            } else if(mode == 0 && idx % 2 == 0){
                ret += code.charAt(idx);
            } else if(mode == 1 && idx % 2 == 1){
                ret += code.charAt(idx);
            }
        }
        
        if(ret.equals("")){
            return "EMPTY";
        } else {
            return ret;
        }
    }
}
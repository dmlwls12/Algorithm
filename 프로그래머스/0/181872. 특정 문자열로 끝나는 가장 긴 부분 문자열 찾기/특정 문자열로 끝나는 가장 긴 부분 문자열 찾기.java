class Solution {
    public String solution(String myString, String pat) {
        
        int lastIndex = myString.lastIndexOf(pat);
        
        if(lastIndex == -1){
            return "";
        }
        return myString.substring(0, lastIndex + pat.length());
    }
}
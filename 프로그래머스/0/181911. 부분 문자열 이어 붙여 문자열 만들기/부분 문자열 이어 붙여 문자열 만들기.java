class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder st = new StringBuilder();
        
        for(int i = 0; i < parts.length; i++){
            int s = parts[i][0];
            int e = parts[i][1];
            

            String str = my_strings[i].substring(s, e + 1);
            st.append(str);

        }
        return st.toString();
    }
}
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        String str = String.valueOf(x);
        
        for(char c : str.toCharArray()){
            sum += Integer.valueOf(String.valueOf(c));
        }
        return x % sum == 0;
    }
}
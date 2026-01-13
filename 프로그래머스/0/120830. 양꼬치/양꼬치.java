class Solution {
    public int solution(int n, int k) {
        int lamb = n * 12000;

        if (n >= 10) { 
            int i = n / 10;
            if (i < k) return lamb + ((k - i) * 2000);
            else return lamb;
        }

        return lamb + k * 2000;
    }
}

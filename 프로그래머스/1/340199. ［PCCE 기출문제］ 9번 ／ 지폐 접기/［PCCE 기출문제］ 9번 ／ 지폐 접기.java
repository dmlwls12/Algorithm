class Solution {
    public int solution(int[] wallet, int[] bill) {
        int count = 0;
        
        while(true) {
            int wMin = Math.min(wallet[0], wallet[1]);
            int wMax = Math.max(wallet[0], wallet[1]);
            int bMin = Math.min(bill[0], bill[1]);
            int bMax = Math.max(bill[0], bill[1]);
            
            if(bMin <= wMin && bMax <= wMax) break;
            
            if(bill[0] >= bill[1]) {
                bill[0] /= 2;
                count++;
            }
            else if(bill[0] <= bill[1]) {
                bill[1] /= 2;
                count++;
            }
        }
        return count;
    }
}
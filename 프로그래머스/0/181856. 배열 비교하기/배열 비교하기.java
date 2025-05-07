class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int sum1 = 0;
        int sum2 = 0;
        
        int first = arr1.length;
        int second = arr2.length;
        
        if(first > second) return 1;
        else if(first < second) return -1;
        
        for(int i = 0; i < arr1.length; i++){
            sum1 += arr1[i];
            sum2 += arr2[i];
        }
        
        return sum1 == sum2 ? 0 : (sum1 > sum2 ? 1 : -1);
    }
}
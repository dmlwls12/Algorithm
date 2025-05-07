class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sum1 = 0;
        int sum2 = 0;
        
        int first = arr1.length;
        int second = arr2.length;
        
        if(first > second){
            answer = 1;
        } else if(first < second){
            answer = -1;
        } else if(first == second){
            for(int i = 0; i < arr1.length; i++){
                sum1 += arr1[i];
                sum2 += arr2[i];
                
                answer = sum1 > sum2 ? 1 : -1;
                
                System.out.println(answer);
                if(sum1 ==  sum2) answer = 0;
            }
        }
        return answer;
    }
}
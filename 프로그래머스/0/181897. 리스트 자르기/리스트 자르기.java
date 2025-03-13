import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        switch (n){
            case 1:
                answer = Arrays.copyOfRange(num_list, 0, b + 1);
                break;
                    
            case 2:
                answer = Arrays.copyOfRange(num_list, a, num_list.length);
                break;
                    
            case 3:
                answer = Arrays.copyOfRange(num_list, a, b + 1);
                break;
                
            case 4:
                int size = ((b - a) / c) + 1;
                answer = new int[size];
                
                for(int i = 0, j = a; j <= b; i++, j += c){
                     answer[i] = num_list[j];
                }
                break;
                    
        }
        return answer;
    }
}
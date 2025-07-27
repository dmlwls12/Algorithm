import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        
        Stack<Integer> basket = new Stack<>();
        int count = 0;
        for(int n : moves){     // 열
            int col = n - 1;
            
            for(int row = 0; row < board.length; row++){        // 행
                int doll = board[row][col];
                
                if(doll != 0){
                    board[row][col] = 0;        // 인형 집으면 제거
                    
                    if(!basket.isEmpty() && basket.peek() == doll){
                        basket.pop();       // 같은 인형이면 터뜨리기 
                        count += 2;     // 두 개 터짐
                    } else {
                        basket.push(doll);      // 인형 바구니에 넣기
                    }
                    break;      // 인형 하나만 집음
                }
            }
        }
        return count;
    }
}
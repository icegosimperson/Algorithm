/*
같은 숫자 = 같은 인형
*/
import java.util.*;
class PG_64061 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int move : moves){
            int col = move-1;
            for(int[] row : board){
                if(row[col]!=0){
                    int doll = row[col];
                    row[col] = 0;
                    if(!stack.isEmpty() && stack.peek()==doll){
                        stack.pop();
                        answer+=2;
                    } else{
                        stack.push(doll);
                    }
                    break;
                }
            }
        }
        return answer; // 사라진 인형의 개수
    }
}
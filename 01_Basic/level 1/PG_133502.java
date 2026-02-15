/* 빵:1, 야채:2, 고기:3
O(N) 이하로 풀이
1-2-3-1 문자 or 문자열로 변경?
*/
import java.util.*;
class PG_133502 {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int in : ingredient){
            stack.push(in);
            if(stack.size() >=4){
                int size = stack.size();
                if(stack.get(size-4) == 1 &&
                        stack.get(size-3) == 2 &&
                        stack.get(size-2) == 3 &&
                        stack.get(size-1) == 1 ){
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    answer++;
                }
            }
        }
        return answer;
    }
}

/*
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int top = 0; // 포인터
        int[] stack = new int[ingredient.length];
        for(int item : ingredient){
            stack[top++] = item;
            if(top >= 4){
                if(stack[top-4]==1 && stack[top-3]==2 &&stack[top-2]==3 && stack[top-1]==1){
                    answer++;
                    top -= 4;
                }
            }
        }
        return answer;
    }
}
 */
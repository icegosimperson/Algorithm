// https://school.programmers.co.kr/learn/courses/30/lessons/12906
// 시간 복잡도 : O(N^2) X -> O(N) 구현

import java.util.*;

// 스택의 원소와 같은 숫자이면 안넣으면 됨
public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack();  // 1) 스택 초기화
      
        stack.push(arr[0]); // 첫번째 값은 일단 넣어
        for(int i=1; i<arr.length; i++){ // 2) 스택에 연속되지 않은 값만 넣어줌
            if(stack.peek() != arr[i]){
                stack.push(arr[i]);
            }
        }
        int[] answer = new int[stack.size()];
        for(int i=stack.size()-1; i>=0; i--){
            answer[i] = stack.pop();
        }
        return answer;
    }
    
}

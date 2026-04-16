import java.util.*;
class PG_154539 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();
        Arrays.fill(answer, -1);
        for(int i=0; i<numbers.length; i++){
            while(!stack.isEmpty() && numbers[stack.peek()] < numbers[i]){
                int index = stack.pop();
                answer[index] = numbers[i];
            }
            stack.push(i);
        }
        return answer;
    }
}
/*
1. "값"뿐만 아니라 "위치"가 중요할 때
2. 거리나 길이를 계산해야 할 때
3. "단조 스택 (Monotonic Stack)"을 만들 때
*/
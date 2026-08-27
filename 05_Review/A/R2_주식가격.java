import java.util.*;
class R2_주식가격 {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();
        // for 배열 순회
        // 가격이 하락했는지 알 수 있는 방법
        // 1)배열 끝까지 탐색 -> 배열길이 - 현재 인덱스
        // 2) 배열 길이 전에 하락 값 등장
        // 바로 값이 정해짐
        // 과거 인덱스 < prices[현재 탐색 인덱스]
        // 과거인덱스 저장 필요 list? stack?
        // 삽입 제거 쉬운 stack에 값이 정해지지않은 인덱스들을 넣었다가, 현재 탐색 인덱스보다 작을 경우 pop하고 answer에 값을 정해준다
        for(int i=0; i<prices.length; i++){
            while(!stack.isEmpty() && prices[stack.peek()] > prices[i]){
                int t = stack.pop();
                answer[t] = i-t;
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int idx = stack.pop();
            answer[idx] = n-1-idx;
        }
        return answer; // 가격이 떨어지지 않은 시간
    }
}
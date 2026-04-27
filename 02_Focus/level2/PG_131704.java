import java.util.*;
class PG_131704 {
    public int solution(int[] order) {
        int answer = 0;
        int box = 1;
        Stack<Integer> stack = new Stack<>();
        for(int target : order){
            while(box<=order.length && box<=target){
                stack.push(box++);
            }
            if(!stack.isEmpty() && stack.peek()==target){
                stack.pop();
                answer++;
            } else break;
        }
        return answer;
    }
}
//class PG_131704 {
//    public int solution(int[] order) {
//        Stack<Integer> stack = new Stack<>();
//        int answer = 0;
//        int box = 1;
//        for(int i=0; i<order.length; i++){
//            if(!stack.isEmpty() && stack.peek()== order[i]){
//                answer++;
//                stack.pop();
//            } else{
//                while(box<order.length && box!=order[i]){
//                    stack.push(box++);
//                }
//                if(box==order[i]){
//                    answer++;
//                    box++;
//                } else break;
//            }
//        }
//        return answer;
//    }
//}
import java.util.*;
class 155.Min Stack {
    private Stack<Integer> stk = new Stack<>();
    private Stack<Integer> minStk = new Stack<>();
    public MinStack() {

    }

    public void push(int value) {
        stk.push(value);
        if(minStk.isEmpty()){
            minStk.push(value);
        }else{
            minStk.push(Math.min(minStk.peek(), value));
        }
    }

    public void pop() {
        stk.pop();
        minStk.pop();
    }

    public int top() {
        return stk.peek();
    }

    public int getMin() {
        return minStk.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
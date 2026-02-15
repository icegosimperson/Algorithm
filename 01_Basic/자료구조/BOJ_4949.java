import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input;

        while(true){
            input = br.readLine();
            if (input.equals(".")) { // 종료조건
                break;
            }
            sb.append(simulation(input)).append('\n');
        }
        System.out.println(sb);
    }
    static String simulation(String input){
        Stack<Character> stack = new Stack<>(); // LIFO
        for(int i=0; i<input.length(); i++) {
            char c = input.charAt(i);

            if (c == '(' || c == '[') {
                stack.push(c);
            }
            else if (c == ')') {
                if (stack.empty() || stack.peek() != '(') { // 스택이 비어있거나 '(' 와 매칭 X
                    return "no";
                } else {
                    stack.pop();
                }
            } else if (c == ']') {
                if (stack.empty() || stack.peek() != '[') { // 스택이 비어있거나 ')' 와 매칭X
                    return "no";
                } else {
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()){
            return "yes";
        }
        else{
            return "no";
        }
    }
}
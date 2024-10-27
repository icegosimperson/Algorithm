import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<T; i++){
            String input = br.readLine();
            for(int j=0; j<input.length(); j++){
                if(input.charAt(j) == '('){
                    stack.push(input.charAt(j));
                }
                else{ // ')'
                    if(stack.isEmpty()) {
                        stack.push(input.charAt(j));
                        break;
                    }
                    stack.pop();
                }
            }
            if(stack.isEmpty()) System.out.println("YES");
            else System.out.println("NO");
            stack.clear(); // ')'가 더 많은 경우 오류 방지
        }
    }
}

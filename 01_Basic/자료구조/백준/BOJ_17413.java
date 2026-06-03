import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        String input = br.readLine();
        boolean flag = false;
        for(int i=0; i<input.length(); i++){
            char c = input.charAt(i);
            if(c=='<'){
                while(!stack.isEmpty()){
                    System.out.print(stack.pop());
                }
                flag = true;
                System.out.print(c);
            } else if(c=='>'){
                flag = false;
                System.out.print(c);
            } else if(flag){
                System.out.print(c);
            }
             else{
                if(c==' '){
                    while(!stack.isEmpty()){
                        System.out.print(stack.pop());
                    }
                    System.out.print(" ");
                } else{
                    stack.push(c);
                }
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}

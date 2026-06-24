import java.util.*;
class 394_Decode String {
    public String decodeString(String s) {
        ArrayDeque<String> stk = new ArrayDeque<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c==']'){
                StringBuilder sb = new StringBuilder();
                while(!stk.isEmpty() && !stk.peek().equals("[")){
                    sb.insert(0, stk.pop());
                }
                stk.pop();
                StringBuilder num = new StringBuilder();
                while(!stk.isEmpty() && Character.isDigit(stk.peek().charAt(0))){
                    num.insert(0, stk.pop());
                }
                int cnt = Integer.parseInt(num.toString());
                stk.push(sb.toString().repeat(cnt));
            } else{
                stk.push(String.valueOf(c));
            }
        }
        StringBuilder result = new StringBuilder();
        while(!stk.isEmpty()){
            result.insert(0, stk.pop());
        }
        return result.toString();
    }
}
import java.util.*;
class 735_Asteroid Collision {
    public int[] asteroidCollision(int[] asteroids) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int cur : asteroids){
            boolean flag = true;
            while(!stack.isEmpty() && stack.peek()>0 && cur<0){
                int prev = stack.peek();
                if(Math.abs(prev)<Math.abs(cur)){
                    stack.pop();
                    continue;
                } else if(Math.abs(prev)==Math.abs(cur)){
                    stack.pop();
                    flag = false;
                    break;
                } else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                stack.push(cur);
            }
        }
        int[] result = new int[stack.size()];
        int idx=0;
        while(!stack.isEmpty()){
            result[idx++] = stack.pollLast();
        }
        return result;
    }
}
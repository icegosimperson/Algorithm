class PG_181917 {
    public boolean op1(boolean x, boolean y){
        if(!x && !y){
            return false;
        }
        return true;
    }
    public boolean op2(boolean x, boolean y){
        if(x && y){
            return true;
        }
        return false;
    }
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = false;
        boolean flag = op1(x1, x2);
        boolean flag2 = op1(x3, x4);
        answer = op2(flag, flag2);
        return answer;
    }
}
/*
class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1||x2)&&(x3||x4);
    }
}
 */
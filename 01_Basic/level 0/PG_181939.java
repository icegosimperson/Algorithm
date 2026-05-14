class PG_181939 {
    public int solution(int a, int b) {
        String A = a + "" + b;
        String B = b + "" + a;
        return Math.max(Integer.parseInt(A), Integer.parseInt(B));
    }
}
/*
class Solution {
    public int solution(int a, int b) {
        String A = String.valueOf(a) + String.valueOf(b);
        String B = String.valueOf(b) + String.valueOf(a);
        int num1 = Integer.parseInt(A);
        int num2 = Integer.parseInt(B);

        return num1>num2? num1 : num2;
    }
}
*/
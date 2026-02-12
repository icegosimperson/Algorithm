class PG_42897_R2 {
    public int solution(int[] money) {
        int n = money.length;
        int case1 = getMaxMoney(money, 0, n-2);
        int case2 = getMaxMoney(money, 1, n-1);
        return Math.max(case1, case2);
    }
    private int getMaxMoney(int[] money, int start, int end){
        int prevPrev = 0;
        int prev=0;
        for(int i=start; i<=end; i++){
            int cur = Math.max(prev, prevPrev + money[i]);
            prevPrev = prev;
            prev = cur;
        }
        return prev;
    }
}
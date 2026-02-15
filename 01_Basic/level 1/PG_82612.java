class PG_82612 {
    public long solution(int price, int money, int count) {
        long temp=0;
        for(int i=1; i<=count; i++){
            temp += (long) price * i;
        }

        return Math.max(temp-money, 0);
    }
}
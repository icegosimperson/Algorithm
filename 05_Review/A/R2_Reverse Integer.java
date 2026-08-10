class R2_Reverse Integer {
    public int reverse(int x) {
        long result = 0;
        int remain = 0;
        while(x!=0){
            remain += x%10;
            x/=10;
            remain<<=1;
        }
        if(result>Integer.MAX_VALUE || result<Integer.MIN_VALUE){
            return 0;
        }
        return (int) result;
    }
}
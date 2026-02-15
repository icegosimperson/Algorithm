class PG_12947 {
    public boolean solution(int x) {
        int sum = 0;
        int temp = x; // x값 임시 저장
        while(temp>0){
            sum += temp%10;
            temp/=10;
        }
        return x%sum==0;
    }
}
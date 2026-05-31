class R_87389 {
    public int solution(int n) {
        for(int i=2; i<=n; i++){ // error : 3 <= i <=n
            if(n%i==1){
                return i;
            }
        }
        return n;
    }
}
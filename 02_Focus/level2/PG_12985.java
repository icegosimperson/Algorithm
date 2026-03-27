class PG_12985{
    public int solution(int n, int a, int b){
        int answer = 0;
        while(a!=b){
            a = (a+1)/2;
            b = (b+1)/2;
            answer++;
        }
        return answer; // a, b가 만나는 라운드
        // return Integer.toBinaryString((a-1)^(b-1)).length();
    }
}
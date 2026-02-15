/*
빈병 a개를 가져다 주면 콜라 b병을 주는 마트 (2병 주면 -> return 1병)

빈병 n개를 주면 몇병을 돌려받을 수 있는가? (20병 보유)
*/
class PG_132267 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n>=a){
            int c = n/a;
            int g = c *b;

            answer += g;

            n= g + (n%a);
        }
        return answer;
    }
}

/*

        int answer = 0;
        int rim = 0;
        while(n/a!=0){
            int tmp = n/a;
            if(n%a!=0){
                rim +=n%a;
            }
            n = tmp;
            answer += n;
        } // n=1, rim =1
        
        while((n+rim)/a!=0){ // 2/2==1
            answer += (n+rim)/a;
        }
*/
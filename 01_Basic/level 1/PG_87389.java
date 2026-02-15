class PG_87389 {
    public int solution(int n) {
        int answer = 0;
        for(int x=1; x<=n; x++){
            if(n%x==1){
                answer = x;
                break;
            }
        }
        return answer;
    }

/*
    class Solution {
    public int solution(int n) {
        int answer = 1;
        while(n%answer!=1){
            answer++;
        }
        return answer;
    }
}
*/


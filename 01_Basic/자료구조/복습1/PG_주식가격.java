class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i=0; i<prices.length; i++){
            int time = 0;
            for(int j=i+1; j<prices.length; j++){
                time++;
                if(prices[i] > prices[j]){
                    answer[i] = time;
                    break;
                }
            }
            answer[i] = time;
        }
        return answer;
    }
}
/*
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i=0; i<prices.length; i++){
            int count = 0;
            for(int j=i; j<prices.length; j++){
                if(j==prices.length-1){
                    answer[i] = count;
                    break;
                }
                if(prices[i] <= prices[j]){
                    count++;
                } else{
                    answer[i] = count;
                    break;
                }
            }
        }
        return answer;
    }
}
 */
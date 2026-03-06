class PG_42584_R5 {
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
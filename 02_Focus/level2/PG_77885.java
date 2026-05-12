class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for(int i=0; i<numbers.length; i++){
            long val = numbers[i];
            if(val%2==0){
                answer[i] = val + 1;
            } else{
                long tmp = ~val;
                long bit = tmp & -tmp;
                answer[i] = (val|bit) & ~(bit>>1);
            }
        }
        return answer;
    }
}
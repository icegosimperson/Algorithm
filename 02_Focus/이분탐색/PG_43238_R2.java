class PG_43238_R2 {
    public long solution(int n, int[] times) {
        long answer = 0;
        long start = 1;
        long end = (long) times[times.length-1] * n;
        while(start<=end){
            long target = 0;
            long mid = (start+end)/2;
            for(int i=0; i<times.length; i++){
                target += mid/times[i];
                if(target>=n) break;
            }
            if(target<n){
                start = mid+1;
            } else{
                end = mid-1;
                answer = mid;
            }
        }
        return answer;
    }
}
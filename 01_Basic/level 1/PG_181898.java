class PG_181898 {
    public int solution(int[] arr, int idx) {
        for(int i=idx; i<arr.length; i++){
            if(arr[i]==1){
                return i;
            }
        }
        return -1;
    }
}
/*
class Solution {
    public int solution(int[] arr, int idx) {
        boolean flag = false;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(idx<=i && arr[i]==1){
                min = Math.min(i, min);
                flag = true;
            }
        }
        return flag ? min : -1;
    }
}
*/
class 1732_Find the Highest Altitude {
    public int largestAltitude(int[] gain) {
        int[] sum = new int[gain.length+1];
        sum[0]=0;
        int max = 0;
        int idx=1;
        for(int i=0; i<gain.length; i++){
            sum[idx] = sum[idx-1] + gain[i];
            max = Math.max(sum[idx], max);
            idx++;
        }
        return max;
    }
}
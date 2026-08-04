class 384.Shuffle an Array {
    private int[] origin;
    private int[] arr;
    private Random rand = new Random();
    public Solution(int[] nums) {
        this.origin=nums.clone();
        this.arr=nums;
    }

    public int[] reset() {
        arr=origin.clone();
        return arr;
    }

    public int[] shuffle() {
        for(int i=arr.length-1; i>0; i--){
            int j=rand.nextInt(i+1);
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        return arr;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
class R2_Shuffle an Array {
    private int[] origin;
    private Random rand = new Random();
    public Solution(int[] nums) {
        this.origin = nums.clone();
    }

    public int[] reset() {
        return origin.clone();
    }

    public int[] shuffle() {
        int[] arr = origin.clone();
        for(int i=0; i<arr.length; i++){
            int j = rand.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
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
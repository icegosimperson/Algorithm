class Find All Numbers Disappeared in an Array{
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> answer = new ArrayList<>();
        int n = nums.length;
        int[] count = new int[n+1];
        for(int num : nums){
            count[num]++;
        }
        for(int i=1; i<=n; i++){
            if(count[i]<1){
                answer.add(i);
            }
        }
        return answer;
    }
}
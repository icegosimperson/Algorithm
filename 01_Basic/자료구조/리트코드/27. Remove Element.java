/*
"배열/리스트에서 특정 조건에 맞는 값들만 골라서 앞으로 모아라"
"in-place"
"제자리에서 값을 재배치"
*/
class 27. Remove Element {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
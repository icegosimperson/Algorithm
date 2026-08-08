import java.util.*;
class R2_Intersection of Two Arrays II {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] count = new int[1001];
        for(int num : nums1){
            count[num]++;
        }
        for(int num : nums2){
            if(count[num]>0){
                list.add(num);
                count[num]--;
            }
        }
        int[] result = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
        // return list.stream().mapToInt(x->x).toArray();
    }
}
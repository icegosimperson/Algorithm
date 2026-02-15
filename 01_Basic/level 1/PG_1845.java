/*
포켓몬 종류 번호의 개수 return

[3, 1, 2, 3]
3번: 2마리, 1,2번: 1마리 (총 4마리)
4마리 고르는 방법 : 4C2
N마리(4) 중 N/2마리 가질 수 잇음(2)
중복 제거 하면 안되나?
*/
import java.util.*;
class PG_1845 {
    public int solution(int[] nums) {
        Set<Integer> sets = new HashSet<>();
        int N = nums.length;
        for(int i=0; i<nums.length; i++){
            sets.add(nums[i]);
        }
        return (sets.size() > N/2) ? N/2 : sets.size();
        // if(sets.size()>N/2){
        //     return N/2;
        // }
        // return sets.size();
    }
}
// N마리 중에 N/2마리 선택 가능
// 가장 많은 종류 고르기 -> 같은 번호 중복이 최대한 없는
// 빠른 탐색을 위한 map 자료구조 필요 O(1)
// Set을 사용해서 처음부터 중복 제거해도 가능
import java.util.*;
class PG_1845_R4 {
    public int solution(int[] nums) {
        int answer = 0;
        int N = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        return Math.min(set.size(), N/2);
    }
}
class PG_77484 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] ranks = {6, 6, 5, 4, 3, 2, 1};
        int zeroCnt = 0;
        int check = 0;

        for(int l : lottos){
            if(l==0){
                zeroCnt++;
                continue;
            }
            for(int w : win_nums){
                if(l==w){
                    check++;
                    break;
                }
            }
        }

        return new int[] {ranks[check+zeroCnt], ranks[check]};
    }
}

/*
solve2) HashSet
import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        // 1. 당첨 번호를 HashSet에 담기 (빠른 검색을 위해)
        Set<Integer> winSet = new HashSet<>();
        for (int num : win_nums) {
            winSet.add(num);
        }

        int zeroCnt = 0;
        int matchCnt = 0;

        // 2. 민우의 로또 번호 확인
        for (int num : lottos) {
            if (num == 0) {
                zeroCnt++;
            } else if (winSet.contains(num)) { // 당첨 번호 세트에 포함되어 있는지 확인
                matchCnt++;
            }
        }

        // 3. 순위 매핑 (맞힌 개수에 따른 순위)
        // index: 맞힌 개수, value: 순위
        int[] rank = {6, 6, 5, 4, 3, 2, 1};

        return new int[] {rank[matchCnt + zeroCnt], rank[matchCnt]};
    }
}
*/
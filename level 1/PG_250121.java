/*
컬럼 이름이 문자열로 들어올 때 -> 문자열을 인덱스 번호로
*/
import java.util.*;

class PG_250121 {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        String[] type = {"code", "date", "maximum", "remain"};
        int extIdx = 0, sortIdx=0;

        for(int i=0; i<4; i++){
            if(type[i].equals(ext)) extIdx = i;
            if(type[i].equals(sort_by)) sortIdx = i;
        }
        List<int[]> list = new ArrayList<>();
        for(int[] d : data){
            if(d[extIdx] < val_ext){
                list.add(d);
            }
        }
        final int f = sortIdx;
        list.sort((a, b) -> a[f] - b[f]);

        int[][] answer = new int[list.size()][4];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
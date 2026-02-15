import java.util.*;

class PG_250121_2 {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        HashMap<String, Integer> map = new HashMap<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);

        int extIdx = map.get(ext);
        int sortIdx = map.get(sort_by);

        List<int[]> list = new ArrayList<>();
        for(int d[] : data){
            if(d[extIdx]< val_ext){
                list.add(d);
            }
        }
        list.sort((a, b) -> a[sortIdx] - b[sortIdx]);

        return list.toArray(new int[0][]);
    }
}
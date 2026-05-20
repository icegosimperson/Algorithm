import java.util.*;
class PG_181923 {
    public int[] solution(int[] arr, int[][] queries) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int[] q : queries){
            int s = q[0];
            int e = q[1];
            int k = q[2];
            int min = Integer.MAX_VALUE;
            for(int j=s; j<=e; j++){
                if(arr[j]>k){
                    min = Math.min(arr[j], min);
                }
            }
            list.add(min==Integer.MAX_VALUE ? -1 : min);
        }
        return list.stream().mapToInt(x->x).toArray();
    }
}
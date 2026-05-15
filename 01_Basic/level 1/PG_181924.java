import java.util.*;
class PG_181924 { // 배열 추가, 삭제 없음 : 순서 바꾸기는 가능
    public int[] solution(int[] arr, int[][] queries) {
        for(int k=0; k<queries.length; k++){
            int i = queries[k][0];
            int j = queries[k][1];
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return arr;
    }
}
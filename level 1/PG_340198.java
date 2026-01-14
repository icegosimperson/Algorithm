import java.util.*;

class PG_340198 {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);
        for(int i=mats.length-1; i>=0; i--){
            int size = mats[i];
            if(canPlace(size, park)){
                return size;
            }
        }
        return -1;
    }
    private static boolean canPlace(int size, String[][] park){
        int r = park.length; int c = park[0].length;
        for(int i=0; i<=r-size; i++){
            for(int j=0; j<=c-size; j++){
                if(isEmpty(i, j, size, park)){
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean isEmpty(int r, int c, int size, String[][] park){
        for(int i=r; i<r+size; i++){
            for(int j=c; j<c+size; j++){
                if(!park[i][j].equals("-1")){
                    return false;
                }
            }
        }
        return true;
    }
}
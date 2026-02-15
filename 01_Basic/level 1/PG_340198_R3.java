import java.util.*;

class PG_340198_R3 {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);
        for(int k=mats.length-1; k>=0; k--){
            int target = mats[k];
            for(int i=0; i<park.length; i++){
                for(int j=0; j<park[0].length; j++){
                    if(isEmpty(i, j, target, park)){
                        return target;
                    }
                }
            }
        }
        return -1;
    }
    private static boolean isEmpty(int nR, int nC, int size, String[][] park){
        if(nR + size > park.length || nC + size > park[0].length){
            return false;
        }
        for(int r=nR; r<nR + size; r++){
            for(int c=nC; c<nC + size; c++){
                if(!park[r][c].equals("-1")){
                    return false;
                }
            }
        }
        return true;
    }
}
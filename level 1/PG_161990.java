/*
. # . . .
. . # . .
. . . # .
*/
class PG_161990 {
    public int[] solution(String[] wallpaper) {
        int top = Integer.MAX_VALUE;
        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;
        int bottom = Integer.MIN_VALUE;

        for(int i=0; i<wallpaper.length; i++){
            for(int j=0; j<wallpaper[i].length(); j++){
                if(wallpaper[i].charAt(j)=='#'){ // 처음 발견한 #
                    top = Math.min(i, top);
                    left = Math.min(j, left);
                    right = Math.max(i+1, right);
                    bottom = Math.max(j+1, bottom);
                }
            }
        }
        return new int[]{top, left, right, bottom}; // 최소한 이동 거리
    }
}
class PG_1712928 {
    public int[] solution(String[] park, String[] routes) {
        int curX = 0; int curY = 0;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        String dir = "ESWN";

        for(int i=0; i<park.length; i++){
            if(park[i].contains("S")){
                curY = i;
                curX = park[i].indexOf("S");
                break;
            }
        }
        for(String r : routes){
            String[] slice = r.split(" ");
            int idx = dir.indexOf(slice[0]);
            int dist = Integer.parseInt(slice[1]);

            int nx = curX; int ny = curY;
            boolean canGo = true;

            for(int i=0; i<dist; i++){
                nx += dx[idx];
                ny += dy[idx];
                if(!isValid(nx, ny, park)){
                    canGo = false;
                    break;
                }
            }
            if(canGo){
                curX = nx;
                curY = ny;
            }
        }
        return new int[]{curY, curX};
    }
    private static boolean isValid(int nx, int ny, String[] park){
        if(ny<0 || ny>=park.length || nx<0 || nx>=park[0].length()) return false;
        if(park[ny].charAt(nx)=='X') return false;
        return true;
    }
}
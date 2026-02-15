class PG_172928 {
    public int[] solution(String[] park, String[] routes) {
        int curY =0; int curX=0;
        // routes 방향 설정
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        String dir = "ESWN";

        for(int i=0; i<park.length; i++){
            if(park[i].contains("S")){
                // 여기가 시작점이 됨
                curY = i;
                curX = park[i].indexOf("S");
                break;
            }
        }

        for(String r : routes){
            String[] slice = r.split(" ");
            int idx = dir.indexOf(slice[0]);
            int dist = Integer.parseInt(slice[1]);
            int ny = curY; int nx = curX;
            boolean canGo = true;
            for(int i=0; i<dist; i++){
                ny += dy[idx]; nx += dx[idx];
                if(!isValid(ny, nx, park)){
                    canGo = false;
                    break;
                }
            }
            if(canGo){
                curY = ny;
                curX = nx;
            }
        }
        return new int[]{curY, curX}; // 로봇강아지의 최종 좌표
    }
    private static boolean isValid(int ny, int nx, String[] park){
        if(ny<0 || ny >=park.length || nx<0 || nx>=park[0].length()) return false;
        if(park[ny].charAt(nx)=='X') return false;
        return true;
    }
}
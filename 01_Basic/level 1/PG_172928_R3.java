class PG_172928_R3 {
    public int[] solution(String[] park, String[] routes) {
        int H = park.length;
        int W = park[0].length();
        int curX =0; int curY=0;

        // "S" 시작 좌표 찾아서
        for(int i=0; i<H; i++){
            if(park[i].contains("S")){
                curY = i;
                curX = park[i].indexOf("S");
                break;
            }
        }

        // routes 명령어 대로 이동
        for(String r : routes){
            String[] slice = r.split(" ");
            String dir = slice[0];
            int move = Integer.parseInt(slice[1]);
            int nx = curX; int ny = curY;
            boolean flag = true;

            for(int k=0; k<move; k++){
                if(dir.equals("E")) nx++;
                else if(dir.equals("W")) nx--;
                else if(dir.equals("S")) ny++;
                else if(dir.equals("N")) ny--;

                if(nx < 0 || nx>=W || ny < 0 || H <= ny || park[ny].charAt(nx)=='X'){
                    flag = false;
                    break;
                }
            }
            if(flag){
                curY = ny;
                curX = nx;
            }
        }
        return new int[] {curY, curX}; // 최종위치 반환
    }
}
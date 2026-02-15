import java.util.*;

class PG_340213_R2 {
    private static int timeToSecond(String time){
        String[] slice = time.split(":");
        int m = Integer.parseInt(slice[0]);
        int s = Integer.parseInt(slice[1]);
        return 60 * m  + s;
    }
    private static String secondToTime(int time){
        int m = time / 60;
        int s = time % 60;
        return String.format("%02d:%02d", m, s);
    }
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int length = timeToSecond(video_len);
        int curPos = timeToSecond(pos);
        int start = timeToSecond(op_start);
        int end = timeToSecond(op_end);

        if(start <= curPos && curPos <= end) curPos = end;
        for(String c : commands){
            if(c.equals("prev")){
                curPos = Math.max(0, curPos-10);
            } else{ // "next"
                curPos = Math.min(curPos+10, length);
            }
            if(start <= curPos && curPos <= end) curPos = end;
        }
        return  secondToTime(curPos);
    }
}
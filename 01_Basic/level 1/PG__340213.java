class PG_340213 {
    private static int timeToSeconds(String time){
        String[] split = time.split(":");
        int m = Integer.parseInt(split[0]);
        int s = Integer.parseInt(split[1]);
        return m*60 + s;
    }
    private static String SecondsToTime(int time){
        int m = time / 60;
        int s = time % 60;
        return String.format("%02d:%02d", m, s);
    }
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int curTime = timeToSeconds(pos);
        int opStart = timeToSeconds(op_start);
        int opEnd = timeToSeconds(op_end);
        int endTime = timeToSeconds(video_len);

        if(opStart <= curTime && curTime <= opEnd) curTime = opEnd;
        for(String cmd : commands){
            if(cmd.equals("prev")) curTime = Math.max(0, curTime-10);
            else curTime = Math.min(curTime+10, endTime);

            if(opStart <= curTime && curTime <= opEnd) curTime = opEnd;
        }
        return SecondsToTime(curTime); // 동영상 위치
    }
}
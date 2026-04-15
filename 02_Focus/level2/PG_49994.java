import java.util.*;
class PG_49994 {
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    public int solution(String dirs) {
        boolean[][][] visited = new boolean[11][11][4];
        int x = 5; int y = 5; // -5~5 -> 0~10
        int answer = 0;
        for(char c : dirs.toCharArray()){
            int k = 0;
            if(c=='U') k = 0;
            else if(c=='D') k=1;
            else if(c=='L') k=2;
            else if(c=='R') k=3;
            int nx = x + dx[k];
            int ny = y + dy[k];
            if(nx<0 || nx>10 || ny<0 || ny>10) continue;
            if(!visited[x][y][k]){
                visited[x][y][k] = true;
                visited[nx][ny][k^1] = true; // (U, D), (L, R)
                answer++;
            }
            x = nx;
            y = ny;
        }
        return answer;
    }
}
/*
import java.util.*;

class Solution {
    public int solution(String dirs) {
        int x = 0; int y = 0;
        int answer = 0;
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<dirs.length(); i++){
            char c = dirs.charAt(i);
            int nx = x;
            int ny = y;
            switch(c){
                case 'L': nx--; break;
                case 'R': nx++; break;
                case 'U': ny++; break;
                case 'D': ny--; break;
            }
            if (nx < -5 || nx > 5 || ny < -5 || ny > 5) continue;
            String path = "";
            if(x<nx || (x==nx && y < ny)){
                path = x + "" + y + "" + nx + "" + ny;
            }
            else{
                path = nx + "" + ny + "" + x + "" + y;
            }
            if(!set.contains(path)){
                set.add(path);
                answer++;
            }
            x = nx;
            y = ny;
        }
        return answer; // 게임 캐릭터가 처음 걸어본 길의 길이
    }
}
 */
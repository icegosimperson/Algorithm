// 원래 숫자로 바꾸는 게임

import java.util.*;

class PG_81301 {
    public int solution(String s) {
        String[] worlds = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i=0; i<worlds.length; i++){
            s = s.replace(worlds[i], Integer.toString(i));
        }

        return Integer.parseInt(s);
    }
}
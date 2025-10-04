/*
012, 021, 102, 120, 201, 210
배열의 원소를
*/

import java.util.*;

class PG_42746 {
    public String solution(int[] numbers) {
        String[] str = new String[numbers.length];

        for(int i=0; i<str.length; i++){
            str[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(str, (o1, o2)->(o2+o1).compareTo(o1+o2));

        if(str[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();

        for(String s : str){
            sb.append(s);
        }

        return sb.toString();
    }
}
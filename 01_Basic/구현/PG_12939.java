import java.util.*;

class PG_12939 {
    public String solution(String s) {
        String answer = "";
        String[] slice = s.split(" ");
        int[] arr = new int[slice.length];
        for(int i=0; i<slice.length; i++){
            arr[i] = Integer.parseInt(slice[i]);
        }
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length-1];
        answer = min + " " + max;
        return answer;
    }
}
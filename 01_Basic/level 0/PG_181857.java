import java.util.*;
class PG_181857 {
    public int[] solution(int[] arr) {
        int target = 1;
        while(target<arr.length){
            target *= 2;
        }
        return Arrays.copyOf(arr, target);
    }
}
/*
import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int[] pow = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        int target = 0;
        for(int p : pow){
            if(p >=len){
                target = p;
                break;
            }
        }
        return Arrays.copyOf(arr, target);
    }
}
*/
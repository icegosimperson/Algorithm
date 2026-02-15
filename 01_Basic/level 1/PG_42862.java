/*
n=30, 시간복잡도 O(N^2) 가능
최대한 많은 학생에게 빌려줄것 Math.max
전체 학생 n명, lost-잃어버림, reverse 빌려주기
단, 빌려줄 수 있는건 +1, -1 번호만 가능
*/
import java.util.*;

class PG_42862 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++){
            arr[i] = 1;
        }

        for(int l : lost) arr[l]--;
        for(int r : reserve) arr[r]++;

        for(int i=1; i<=n; i++){
            if(arr[i]==0){
                if(i-1>=1 && arr[i-1]==2){
                    arr[i-1] = 1;
                    arr[i] = 1;
                } else if(i+1 <=n && arr[i+1]==2){
                    arr[i+1] = 1;
                    arr[i] = 1;
                }
            }
        }
        for(int i=1; i<=n; i++){
            if(arr[i]>=1) answer++;
        }
        return answer;
    }
}

/*
        HashMap<Integer, Integer> map = new HashMap<>(); // <학생 번호, 체육복 개수>
        
        for(int i=0; i<n; i++) map.put(i, 1);
        int index = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            map.put(index, 0);
            index++;
        }
        
        int i=0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(map.get(i)==reserve[i]){
                map.put(i+1, map.get(+1));
            } else if(map.get(i)==lost[i]){
                map.put(i+1, map.get(-1));
            }
            i++;
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(map.containsValue(1)) answer++;
        }
        return answer;
*/
import java.util.*;
class R2_모의고사 {
    public int[] solution(int[] answers) {
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int len = answers.length;
        int cnt1 = 0; int cnt2 = 0; int cnt3 = 0;
        for(int i=0; i<len; i++){
            int a = answers[i];
            if(a==p1[i%p1.length]){
                cnt1++;
            }
            if(a==p2[i%p2.length]){
                cnt2++;
            }
            if(a==p3[i%p3.length]){
                cnt3++;
            }
        }
        int max = Math.max(cnt1, Math.max(cnt2, cnt3));
        ArrayList<Integer> list = new ArrayList<>();
        if(cnt1==max){
            list.add(1);
        }
        if(cnt2==max){
            list.add(2);
        }
        if(cnt3==max){
            list.add(3);
        }
        int[] arr = new int[list.size()];
        for(int i=0; i<arr.length; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
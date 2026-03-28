import java.util.*;

class PG_131127 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> wantMap = new HashMap<>();
        Map<String, Integer> discountMap = new HashMap<>();
        for(int i=0; i<want.length; i++){
            wantMap.put(want[i], number[i]);
        }
        for(int i=0; i<discount.length; i++){
            discountMap.put(discount[i], discountMap.getOrDefault(discount[i], 0)+1);
            if(i>=10){
                String out = discount[i-10];
                if(discountMap.get(out)==1){
                    discountMap.remove(out);
                } else{
                    discountMap.put(out, discountMap.get(out)-1);
                }
            }
            if(i>=9){
                if(wantMap.equals(discountMap)){
                    answer++;
                }
            }
        }
        return answer;
    }
}
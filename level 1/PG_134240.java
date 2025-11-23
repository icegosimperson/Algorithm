/*
f[0] = 물의 양 항상 1
f[1] 1번 음식의 수 = 3
f[2] 2번 음식의 수 = 4
f[3] 3번 음식의 수 = 6
*/
class PG_134240 {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<food.length; i++){
            int cnt = food[i]/2;
            sb.append(String.valueOf(i).repeat(cnt));
        }
        String answer = sb + "0";
        answer += sb.reverse();
        return answer;
    }
}
class PG_12911 {
    public int solution(int n) {
        int answer = n;
        int target = Integer.bitCount(n);
        while(true){
            answer++;
            if(Integer.bitCount(answer)==target){
                return answer;
            }
        }
    }
}
/*
class Solution {
    public int solution(int n) {
        String binary = Integer.toBinaryString(n);
        int count = 0;
        for(int i=0; i<binary.length(); i++){
            char c = binary.charAt(i);
            if(c=='1'){
                count++; // 2진수의 1의 개수
            }
        }
        int answer = n;
        boolean flag = false;
        while(!flag){
            answer += 1; // 1씩 더하기?
            int tempCount = 0;
            String temp = Integer.toBinaryString(answer);
            for(int i=0; i<temp.length(); i++){
                char c = temp.charAt(i);
                if(c=='1'){
                    tempCount++;
                }
            }
            if(tempCount==count){
                flag = true;
            }
        }
        // n보다 큰 값
        // n보다 큰 2진수의 1의 개수가 동일한 것중 가장 작은 수.. O(n) 이하로 풀기
        // 일단 n보다 커야함
        // if(n < answer)
        return answer;
    }
}
*/
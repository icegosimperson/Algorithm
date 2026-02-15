/*
return 무기를 만들기 위해 필요한 철의 무게(1kg = 1 공격력)

number = 기사 번호
limit = 제한 수치
power = 초과한 기사가 사용할 무기의 공격력

number = 5
5번 기사가 사용할 수 있는 공격력 (1, 5) = 2개 -> 2
limit = 3이니까 4 = 1, 2, 4 -> 3개! (if, 약수의 개수가 <= limit)
1번부터 5번까지 기사단 공격력은 [1, 2, 2, 3, 2]

number = 10
10번 기사까지 (1, 2, 5, 10) = 4개 -> 4
limit = 3 (if, 약수의 개수 <= 3)
1~10 (6 = 1, 2, 3, 6 -> 4개 -> (if, 약수의 개수 > limit -> power = 2 사용)
[1, 2, 2, 3, 2, 2, 2, 2, 3, 2]
return += 21
*/
class PG_136798 {
    // 약수의 개수를 구함
    private static int primeCnt(int n){
        int cnt = 0;
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                if(i*i==n){ // 제곱수일 경우
                    cnt += 1;
                } else cnt += 2;
            }
        }
        return cnt;
    }
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=1; i<=number; i++){ // 1~10
            int cnt = primeCnt(i);
            if(cnt <= limit){
                answer += cnt;
            } else{
                answer += power;
            }
        }

        return answer;
    }
}

/*
배수 기반 약수 cnt
for (int i = 1; i <= number; i++) {
    for (int j = 1; j <= number / i; j++) {
        count[i * j]++;
    }
}
j = 1~number
1, 2, 3, ... number 까지 모든 수에 +1

j = 1~number/2
2, 4, 6, 8, ... 이런 짝수들에 +1
 */
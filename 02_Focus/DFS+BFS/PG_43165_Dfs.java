/*
이 문제는 DFS 유형이다
그 이유는 타겟 넘버를 만드는 방법으로 더하거나 빼는 경우 2가지가 있는데,
    이것을 재귀로 모든 경우를 탐색 가능하기 때문이다.
*/
class PG_43165_Dfs {
    int answer = 0; // 전역변수로 관리 -> 리턴값 간결
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return answer;
    }
    public void dfs(int[] numbers, int target, int index, int sum){
        // 종료 조건
        if(index==numbers.length){  // 재귀로 탐색한 길이 == numbers 배열의 길이-> 종료
            if(sum==target) answer++; // + 가지치기
            return;
        }
        // 수행 동작
        dfs(numbers, target, index+1, sum+numbers[index]); // 더하는 경우
        dfs(numbers, target, index+1, sum-numbers[index]); // 빼는 경우
    }
}
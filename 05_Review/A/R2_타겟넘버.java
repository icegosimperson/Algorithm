
class R2_타겟넘버 {
    public int solution(int[] numbers, int target) {
        // 더하거나 + 뺴거나
        // 모든 경우를 하나씩 더하거나 빼봐야함 -> 완탐 -> 재귀 -> dfs
        // [1, 1, 1, 1, 1] target=5
        return dfs(numbers, target, 0, 0); // 타겟 넘버를 만드는 방법의 수
    }
    public int dfs(int[] number, int target, int index, int sum){
        if(index==number.length){
            if(sum==target){
                return 1;
            }
            return 0;
        }
        int plus = dfs(number, target, index+1, sum+number[index]);
        int minus = dfs(number, target, index+1, sum-number[index]);
        return plus + minus;
    }
}
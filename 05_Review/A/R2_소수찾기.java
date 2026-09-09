import java.util.*;
class R2_소수찾기 {
    public int solution(String numbers) {
        int answer = 0;
        boolean[] visited = new boolean[numbers.length()];
        HashSet<Integer> set = new HashSet<>();
        dfs(numbers, visited, "", set);
        for(int num : set){
            if(isPrime(num)){
                answer++;
            }
        }
        return answer;
    }
    public void dfs(String numbers, boolean[] visited, String cur, HashSet<Integer> set){
        for(int i=0; i<numbers.length(); i++){
            if(visited[i]){
                continue;
            }
            visited[i] = true;
            String next = cur + numbers.charAt(i);
            set.add(Integer.parseInt(next));
            dfs(numbers, visited, next, set);
            visited[i] = false;
        }
    }
    public boolean isPrime(int N){
        if(N<2){
            return false;
        }
        for(int i=2; i<=Math.sqrt(N); i++){
            if(N%i==0){
                return false;
            }
        }
        return true;
    }
}
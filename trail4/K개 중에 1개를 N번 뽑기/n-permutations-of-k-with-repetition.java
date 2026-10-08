import java.util.*;

public class Main {
    public static ArrayList<Integer> ans = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        // Please write your code here.
        dfs(k, n, 0);
    }
    // 1~3중에 2번 뽑아서 난올 수 있는 모든 서로 다른 수열
    public static void dfs(int k, int n, int idx){
        if(idx==n){
            for(int i=0; i<ans.size(); i++){
                System.out.print(ans.get(i) + " ");
            }
            System.out.println();
            return;
        }
        for(int i=1; i<=k; i++){
            ans.add(i);
            dfs(k, n, idx+1);
            ans.remove(ans.size()-1);
        }
    }
}
import java.util.*;
public class Main {
    public static int cnt=0;
    public static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        dfs(n, 0);
        System.out.println(cnt);
    }
    public static boolean isValid(){
        int idx = 0;
        while(idx<list.size()){
            int num = list.get(idx);
            if(idx+num>list.size()){
                return false;
            }
            for(int i=idx; i<idx+num; i++){
                if(list.get(i)!=num){
                    return false;
                }
            }
            idx += num;
        }
        return true;
    }
    public static void dfs(int n, int depth){
        if(depth==n){
            if(isValid()){
                cnt++;
            }
            return;
        }
        for(int i=1; i<=4; i++){
            list.add(i);
            dfs(n, depth+1);
            list.remove(list.size()-1);
        }
    }
}
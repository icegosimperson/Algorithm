import java.util.Scanner;
public class Main {
    static int n;
    static int answer = 0;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // Please write your code here.
        arr = new int[n];
        dfs(0);
        System.out.println(answer);
    }
    public static void dfs(int depth){
        if(depth==n){
            if(isValid(arr)){
                answer++;
            }
            return;
        }
        for(int i=1; i<=4; i++){
            arr[depth] = i;
            dfs(depth+1);
        }
    }
    // if(depth==len)이 종료 조건일 듯
    public static boolean isValid(int[] arr){
        int cur = arr[0];
        int cnt = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]==cur){
                cnt++;
            } else{
                if(cnt%cur!=0){
                    return false;
                }
                cur = arr[i];
                cnt = 1;
            }
        }
        return cnt % cur == 0;
    }
}
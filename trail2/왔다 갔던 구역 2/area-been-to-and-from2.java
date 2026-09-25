import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cur = 0;
        int[] arr = new int[2001];
        int offset = 1000;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            // [k, k+1]
            int next;
            if(dir=='L'){
                next = cur - x;
            } else{ // dir=='R'
                next = cur + x;
            }
            int start = Math.min(next, cur);
            int end = Math.max(next, cur);
            for(int j=start; j<end; j++){
                arr[j+offset]++;
            }
            cur = next;
        }
        int answer = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=2){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
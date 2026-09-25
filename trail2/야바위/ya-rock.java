import java.util.Scanner;

public class Main {
    public static int maxCnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        // N번 시행 후 얻을 수 있는 최대 점수 출력
        for(int start=1; start<=3; start++){
            int stone = start;
            int cnt = 0;
            for(int i=0; i<n; i++){
                if(stone==a[i]){
                    stone = b[i];
                } else if(stone==b[i]){
                    stone = a[i];
                }
               if(stone==c[i]){
                cnt++;
               } 
            }
            maxCnt = Math.max(cnt, maxCnt);
        }
        System.out.println(maxCnt);
    }
}
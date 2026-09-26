import java.util.Scanner;

public class Main {
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
        int maxCnt = 0;
        for(int s=1; s<=3; s++){
            int cnt = 0;
            int cur = s;
            for(int i=0; i<n; i++){
                if(cur==a[i]){
                    cur = b[i];
                } else if(cur==b[i]){
                    cur = a[i];
                }
                if(cur==c[i]){
                    cnt++;
                }
            }
            maxCnt = Math.max(maxCnt, cnt);
        }
        System.out.println(maxCnt);
    }
}
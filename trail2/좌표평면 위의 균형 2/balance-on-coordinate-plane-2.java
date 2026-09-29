import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int xMax = -1;
        int yMax = -1;
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            xMax = Math.max(xMax, x[i]);
            yMax = Math.max(yMax, y[i]);
        }
        // Please write your code here.
        int ans = Integer.MAX_VALUE;
        for(int curX=2; curX<=100; curX+=2){
            for(int curY=2; curY<=100; curY+=2){
                int q1=0, q2=0, q3=0, q4=0;
                for(int i=0; i<n; i++){
                    if(x[i]>curX && y[i]>curY) q1++;
                    else if(x[i]<curX && y[i]>curY) q2++;
                    else if(x[i]<curX && y[i]<curY) q3++;
                    else if(x[i]>curX && y[i]<curY) q4++;
                }
                int max = Math.max(Math.max(q1, q2), Math.max(q3, q4));
                ans = Math.min(ans, max);
            }
        }
        System.out.println(ans);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            arr[i] *= 2;
            for(int j=0; j<n; j++){
                int score = 0;
                int[] rArr = new int[n-1];
                int temp = 0;
                for(int k=0; k<n; k++){
                    if(k!=j){
                        rArr[temp++] = arr[k];
                    }
                }
                for(int k=0; k<rArr.length-1; k++){
                    score += Math.abs(rArr[k] - rArr[k+1]);
                }
                min = Math.min(min, score);
            }
            arr[i] /=2;
        }
        System.out.println(min);
    }
}
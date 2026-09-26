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
                int prev = 0;
                boolean hasPrev = false;
                for(int k=0; k<n; k++){
                    if(k==j){
                        continue;
                    }
                    if(!hasPrev){
                        prev = arr[k];
                        hasPrev = true;
                    } else{
                        score += Math.abs(prev - arr[k]);
                        prev = arr[k];
                    }
                }
                min = Math.min(min, score);
            }
            arr[i] /=2;
        }
        System.out.println(min);
    }
}
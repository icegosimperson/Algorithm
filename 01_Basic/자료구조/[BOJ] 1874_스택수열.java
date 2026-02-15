import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N]; // 수열 배열 선언

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int num = 1; // 오름차순
        boolean result = true;

        for(int i=0; i<arr.length; i++){
            int su = arr[i];
            if(su >= num){
                while(su >= num){ // 같아질 때까지 반복
                    stack.push(num++); // push
                    sb.append("+\n"); // + 저장
                }
                stack.pop();
                sb.append("-\n");
            }else{
                int n = stack.pop();
                if(n > su){
                    System.out.println("NO");
                    result = false;
                    break;
                } else{
                    sb.append("-\n");
                }
            }
        }
        if(result) { // true
            System.out.println(sb);
        }
    }
}




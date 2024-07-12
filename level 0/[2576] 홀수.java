import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input;
        int sum =0;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<7; i++){
            input = sc.nextInt();
            if(input % 2 ==1){
                sum += input;
                if(input <min){
                    min = input;
                }
            }
        }

        if(sum > 0){
            System.out.println(sum);
            System.out.print(min);
        } else {
            System.out.print(-1);
        }
        sc.close();
    }
}

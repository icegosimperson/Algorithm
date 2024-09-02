import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 3; i > 0; i--) {
            String str = sc.next();
            if(str.matches("-?\\d+(\\.\\d+)?")){ // 문자열이 숫자열인지 판별하는 정규 표현식
                int n = Integer.parseInt(str) + i;
                if(n % 3 == 0) {
                    if (n % 5 == 0) {
                        System.out.println("FizzBuzz");
                    } else {
                        System.out.println("Fizz");
                    }
                }
                else if(n % 5 == 0){
                    System.out.println("Buzz");
                }
                else {
                    System.out.println(n);
                }
                return;
            }
        }
        sc.close();
    }
}


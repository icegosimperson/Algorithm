import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input;
        int result;
        String res = "DCBAE";

        for(int i=0; i<3; i++){
            result = 0;
            for(int j=0; j<4; j++){ // 세번째 줄까지
                input = sc.nextInt();
                result += input;
            }
            System.out.println(res.charAt(result)); // charAt() 메소드 : 문자열에서 주어진 인덱스 위치에 있는 문자를 가져옴
        }
    }
}

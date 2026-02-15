import java.util.Scanner;

public class BOJ_11648 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next(); // 수는 최대 9자리이므로 String으로 받아 처리
        int count = 0;

        while (n.length() > 1) {
            int product = 1;
            for (int i = 0; i < n.length(); i++) {
                product *= n.charAt(i) - '0'; // 각 자리 숫자 곱셈
            }
            n = String.valueOf(product); // 다음 단계 수로 교체
            count++;
        }

        System.out.println(count);
    }
}
import java.util.Scanner;

public class BOJ_4447 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());  // 테스트케이스 개수

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int g = 0, b = 0;

            for (char c : name.toLowerCase().toCharArray()) {
                if (c == 'g') g++;
                if (c == 'b') b++;
            }

            System.out.print(name + " is ");

            if (g > b) {
                System.out.println("GOOD");
            } else if (g < b) {
                System.out.println("A BADDY");
            } else {
                System.out.println("NEUTRAL");
            }
        }
    }
}
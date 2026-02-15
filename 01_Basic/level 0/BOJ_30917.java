import java.util.Scanner;

public class BOJ_30917 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // A와 B를 동시에 찾는 방식
        int A = 0, B = 0;
        boolean foundA = false, foundB = false;

        for (int i = 1; i <= 10000 && (!foundA || !foundB); i++) {
            if (!foundA) {
                System.out.println("? A " + i);
                System.out.flush();
                int responseA = sc.nextInt();
                if (responseA == 1) {
                    A = i;
                    foundA = true;
                }
            }

            if (!foundB) {
                System.out.println("? B " + i);
                System.out.flush();
                int responseB = sc.nextInt();
                if (responseB == 1) {
                    B = i;
                    foundB = true;
                }
            }
        }

        System.out.println("! " + (A + B));
        System.out.flush();
        sc.close();
    }
}
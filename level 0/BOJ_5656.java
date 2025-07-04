import java.util.Scanner;

public class BOJ_5656 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNum = 1;

        while (true) {
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();

            if (op.equals("E")) break;

            boolean result = false;

            switch (op) {
                case ">":
                    result = a > b;
                    break;
                case ">=":
                    result = a >= b;
                    break;
                case "<":
                    result = a < b;
                    break;
                case "<=":
                    result = a <= b;
                    break;
                case "==":
                    result = a == b;
                    break;
                case "!=":
                    result = a != b;
                    break;
            }

            System.out.println("Case " + caseNum + ": " + (result ? "true" : "false"));
            caseNum++;
        }
    }
}
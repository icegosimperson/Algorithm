import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 세 수 입력 받고
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = Math.min(Math.min(a, b), c); // min
        int e = Math.max(Math.max(a, b), c); // max
        int f = a + b+ c - d - e;

        System.out.println(d + " " + f + " " + e);
    }
}

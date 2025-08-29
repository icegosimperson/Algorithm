import java.util.Scanner;

public class BOJ_19572 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float d1 = sc.nextFloat();
        float d2 = sc.nextFloat();
        float d3 = sc.nextFloat();

        float a = (d1 + d2 - d3) / 2;
        float b = (d1 - d2 + d3) / 2;
        float c = (-d1 + d2 + d3) / 2;

        if (a >= 0.05 && b >= 0.05 && c >= 0.05) {
            System.out.println("1");
            System.out.printf("%.1f %.1f %.1f\n", a, b, c);
        } else {
            System.out.println("-1");
        }
    }
}
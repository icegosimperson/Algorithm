import java.util.Scanner;

public class BOJ_20492{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int case1 = (int)(N * 0.78);      // 1번 경우: N - N * 0.22
        int case2 = (int)(N * 0.956);     // 2번 경우: N - (N * 0.2 * 0.22)

        System.out.println(case1 + " " + case2);
    }
}
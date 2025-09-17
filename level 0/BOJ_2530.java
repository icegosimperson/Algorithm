import java.util.Scanner;

public class BOJ_2530 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 현재 시각 입력
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int second = sc.nextInt();

        // 요리 시간 입력 (초 단위)
        int cookTime = sc.nextInt();

        // 현재 시각을 모두 초 단위로 변환
        int totalSeconds = hour * 3600 + minute * 60 + second;

        // 요리 시간을 더함
        totalSeconds += cookTime;

        // 하루는 86400초 (24 * 60 * 60)
        // 24시간을 넘어가면 다음 날로 넘어가므로 나머지 연산 사용
        totalSeconds %= 86400;

        // 다시 시, 분, 초로 변환
        int resultHour = totalSeconds / 3600;
        int resultMinute = (totalSeconds % 3600) / 60;
        int resultSecond = totalSeconds % 60;

        System.out.println(resultHour + " " + resultMinute + " " + resultSecond);

        sc.close();
    }
}
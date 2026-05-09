import java.util.*;

public class example4 {
    public static void main(String[] args) {
        int[] production = {3, 1, 2, 1, 6, 2, 2, 1};
        int[] demand = {2, 0, 1, 1, 1, 2, 1, 1};

        System.out.println("최소 설치 개수: " + solve(production, demand));
    }

    public static int solve(int[] production, int[] demand) {
        int installCount = 0;
        int currentPower = 0;
        // 지나온 발전소들의 생산량을 저장 (가장 큰 값을 뽑기 위해 최대 힙 사용)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < demand.length; i++) {
            // 현재 날짜의 생산 가능 후보군에 추가
            pq.add(production[i]);

            // 오늘 수요를 감당할 전력이 부족하다면?
            while (currentPower < demand[i]) {
                // 이전에 지나온 곳 중 가장 생산량이 큰 곳에 설치한 것으로 간주
                if (pq.isEmpty()) break; // 설치할 곳이 없다면 종료

                currentPower += pq.poll();
                installCount++;
            }

            // 오늘 수요 차감
            currentPower -= demand[i];
        }

        return installCount;
    }
}
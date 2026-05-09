import java.util.*;

public class CardScoreCalculator {
    public static void main(String[] args) {
        int[] dice = {3, 1, 3, 2, 5};
        String[] card = {"Low", "Low", "HIGH", "HIGH", "Low"};

        System.out.println("총점: " + solution(dice, card));
    }

    public static long example3(int[] dice, String[] card) {
        long totalScore = 0;
        // 각 숫자가 나온 횟수를 기록 (메모의 Map<Integer, Integer> 활용)
        Map<Integer, Integer> historyMap = new HashMap<>();
        // 지금까지 나온 숫자들을 저장할 리스트
        List<Integer> currentNumbers = new ArrayList<>();

        for (int i = 0; i < dice.size; i++) {
            int p = dice[i];
            String cardType = card[i];

            // 1. 기본 점수 계산: p + (p * 앞에서 p가 나온 횟수)
            int countP = historyMap.getOrDefault(p, 0);
            totalScore += (long) p + ((long) p * countP);

            // 횟수 업데이트 및 리스트에 추가
            historyMap.put(p, countP + 1);
            currentNumbers.add(p);

            // 2. 보너스 점수 계산
            if (currentNumbers.size() >= 2) {
                // 리스트를 복사하여 정렬 (원본 순서 유지를 위해)
                List<Integer> sortedList = new ArrayList<>(currentNumbers);
                Collections.sort(sortedList);

                if (cardType.equalsIgnoreCase("Low")) {
                    // 가장 작은 수 + 두 번째로 작은 수
                    totalScore += sortedList.get(0) + sortedList.get(1);
                } else if (cardType.equalsIgnoreCase("HIGH")) {
                    // 가장 큰 수 + 두 번째로 큰 수
                    int n = sortedList.size();
                    totalScore += sortedList.get(n - 1) + sortedList.get(n - 2);
                }
            }
        }
        return totalScore;
    }
}
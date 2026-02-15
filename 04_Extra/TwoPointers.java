import java.io.IOException;

public class TwoPointers {
    /**
     * 배열에서 합이 Target 이상인 부분 배열을 찾는 투 포인터 기본 템플릿
     * (문제에 따라 로직 내부의 조건과 answer 처리 방식이 달라집니다.)
     * @param arr 탐색할 정수 배열
     * @param target 목표 값 (예: 부분 합 목표)
     * @return 문제에서 요구하는 결과 값 (예: 개수, 최솟값 등)
     */
    public static int findSubarrays(int[] arr, int target) {
        int N = arr.length;
        int start = 0; // 시작 포인터
        int end = 0;   // 종료 포인터
        long currentSum = 0; // 현재 상태 값 (합계) - 오버플로우 방지를 위해 long 사용 권장
        int answer = 0; // 분리된 부분 배열의 개수 등 정답 변수

        // [1] end 포인터가 배열의 끝까지 갈 때까지 반복
        while (end < N) {
            // 1. 상태 확장 (end 이동): currentSum에 현재 end 인덱스의 값을 추가
            currentSum += arr[end];

            // [2] 상태 처리 및 수축 (start 이동)
            // 목표(Target)를 만족하거나 초과하면 start를 이동시켜 상태를 축소/조정
            while (currentSum >= target) {
                // ⭐ [목표 달성] (answer 갱신)
                if (currentSum == target) {
                    answer++; // 합이 정확히 target인 경우 개수 증가
                }
                currentSum -= arr[start]; // start 포인터 이동 (배열 범위 축소)
                start++;
            }
            // [3] end 포인터 이동 (배열 범위 확장)
            end++;
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] testArr = {1, 2, 3, 2, 5};
        int targetValue = 5;

        int result = findSubarrays(testArr, targetValue);

        System.out.println("목표 합 " + targetValue + "을 만족하는 부분 배열의 개수 (또는 결과): " + result);
    }
}
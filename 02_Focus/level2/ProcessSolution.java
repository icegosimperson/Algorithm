import java.util.*;

public class ProcessSolution {
    public int[] solution(int[][] jobs) {
        int n = jobs.length;
        int[] answer = new int[n];

        // 1. 요청 시간(index 1) 순으로 전체 업무 정렬
        Arrays.sort(jobs, (a, b) -> a[1] - b[1]);

        // 2. 우선순위 큐 설정
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            // 조건 1: 주요 업무량(처리시간 index 2) 먼저 (작은 순서 가정)
            if (a[2] != b[2]) {
                return a[2] - b[2];
            }
            // 조건 2: 요청 시간(index 1)이 짧은 순서
            if (a[1] != b[1]) {
                return a[1] - b[1];
            }
            // 조건 3: 처리 시간(index 2)이 짧은 순서 (이미 조건 1과 같으므로 생략 가능하나 명시)
            return a[2] - b[2];
        });

        int currentTime = 0;
        int jobIdx = 0;
        int count = 0;

        while (count < n) {
            // 현재 시점까지 들어온 모든 작업을 큐에 추가
            while (jobIdx < n && jobs[jobIdx][1] <= currentTime) {
                pq.add(jobs[jobIdx++]);
            }

            if (pq.isEmpty()) {
                // 당장 처리할 작업이 없으면 다음 작업의 요청 시간으로 이동
                currentTime = jobs[jobIdx][1];
                continue;
            }

            // 큐에서 우선순위가 높은 작업 꺼내기
            int[] current = pq.poll();

            // 작업 완료 후 시간 갱신
            currentTime += current[2];
            // 결과 배열에 업무 번호(index 0) 저장
            answer[count++] = current[0];
        }

        return answer;
    }
}
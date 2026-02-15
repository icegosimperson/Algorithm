import java.util.*;

class PG_12935 {
    public int[] solution(int[] arr) {
        // 1. 배열 길이가 1이면 [-1] 리턴
        if (arr.length == 1) return new int[]{-1};

        // 2. 가장 작은 수 찾기
        int min = arr[0];
        for (int n : arr) {
            if (n < min) min = n;
        }

        // 3. 최소값을 제외한 나머지 값만 리스트에 추가
        List<Integer> list = new ArrayList<>();
        for (int n : arr) {
            if (n != min) list.add(n);
        }

        // 4. 리스트를 int[]로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
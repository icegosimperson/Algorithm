// LRU
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 주머니 크기 및 필요한 자료구조 선언
        int pocketSize = 3;
        Queue<Integer> pocket = new LinkedList<>();
        Set<Integer> pocketSet = new HashSet<>();
        List<Integer> discarded = new ArrayList<>();

        while (st.hasMoreTokens()) {
            int item = Integer.parseInt(st.nextToken());

            if (pocketSet.contains(item)) {
                // 이미 주머니에 있는 아이템 -> 우선순위 갱신
                pocket.remove(item); // 큐에서 제거
                pocket.add(item);    // 큐의 맨 뒤에 다시 삽입
            } else {
                // 주머니에 없는 아이템
                if (pocket.size() == pocketSize) {
                    // 주머니가 가득 찼으면 가장 오래된 아이템 삭제
                    int removed = pocket.poll();
                    pocketSet.remove(removed);
                    discarded.add(removed); // 버린 아이템 기록
                }
                // 새 아이템 추가
                pocket.add(item);
                pocketSet.add(item);
            }
        }

        // 결과 출력
        if (discarded.isEmpty()) {
            System.out.println(0);
        } else {
            for (int item : discarded) {
                System.out.print(item + " ");
            }
        }
    }
}

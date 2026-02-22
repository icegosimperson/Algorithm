import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = {20, 50, 10, 30}; // N<=300,000
        int[] b = {15, 40, 5, 25};
        int x = 10;
        int n = a.length;

        // 1. x를 뺏어올 수 있는 총량(자원)을 먼저 구합니다.
        // a[i] >= x 이고 b[i] >= x 인 모든 곳에서 x를 가져옵니다.
        long totalX = 0;
        boolean[] isExtracted = new boolean[n]; // 어디서 뺐는지 체크용

        for (int i = 0; i < n; i++) {
            if (a[i] >= x && b[i] >= x) {
                totalX += x;
                isExtracted[i] = true; // 여기서 x를 뺐다고 표시
            }
        }

        // 2. 이제 각 인덱스(i)에 몰아줬을 때의 결과값 중 최댓값을 찾습니다.
        long maxResult = 0;
        for (int i = 0; i < n; i++) {
            long currentVal;

            if (isExtracted[i]) {
                // 이 위치에서 x를 이미 뺐다면, (원래값 - x)에 전체 보너스를 더함
                currentVal = (long) a[i] - x + totalX;
            } else {
                // 이 위치에서 x를 안 뺐다면, (원래값)에 전체 보너스를 더함
                currentVal = (long) a[i] + totalX;
            }

            // 최댓값 갱신
            if (currentVal > maxResult) {
                maxResult = currentVal;
            }
        }

        System.out.println("최종 최댓값: " + maxResult);
    }
}
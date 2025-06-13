package array.p7;

import java.util.*;

public class Main {

    // ① 정렬 + HashMap 방식
    public int[] rankByMap(int n, int[] arr) {
        int[] answer = new int[n];
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;

        for (int i = n - 1; i >= 0; i--) {
            if (i < n - 1 && sorted[i] != sorted[i + 1]) {
                rank = n - i;
            }
            rankMap.putIfAbsent(sorted[i], rank);
        }

        for (int i = 0; i < n; i++) {
            answer[i] = rankMap.get(arr[i]);
        }

        return answer;
    }

    // ② 2중 반복문 방식
    public int[] rankByLoop(int n, int[] arr) {
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) cnt++;
            }
            answer[i] = cnt;
        }

        return answer;
    }

    // 벤치마크 수행
    public static void main(String[] args) {
        Main T = new Main();

        int n = 100_000; // 테스트 수 (수정 가능)
        int[] arr = new int[n];
        Random rand = new Random();

        // 랜덤한 점수 생성 (1 ~ 10000)
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(10000) + 1;
        }

        // 정렬 + Map 방식 측정
        long start1 = System.nanoTime();
        T.rankByMap(n, arr);
        long end1 = System.nanoTime();
        System.out.println("정렬 + Map 방식: " + (end1 - start1) / 1_000_000.0 + " ms");

        // 2중 for문 방식 측정
        long start2 = System.nanoTime();
        T.rankByLoop(n, arr);
        long end2 = System.nanoTime();
        System.out.println("2중 반복문 방식: " + (end2 - start2) / 1_000_000.0 + " ms");
    }
}


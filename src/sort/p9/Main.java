package sort.p9;

import java.util.Scanner;

public class Main {

    public int solution(int[] arr, int cnt) {
        int answer = 0;
        int lt = arr[0];
        int rt = 0;
        for (int x : arr) {
            rt += x;
        }

        int mid;

        while (lt <= rt) {
            mid = (lt + rt) / 2;
            if (isPossible(arr, mid, cnt)) {
                rt = mid - 1;
                answer = mid;
            } else {
                lt = mid + 1;
            }
        }

        return answer;
    }

    public boolean isPossible(int[] songs, int diskSize, int cnt) {
        int ct = 1;
        int curr = 0;
        for (int i = 0; i < songs.length; i++) {
            curr += songs[i];
            if (curr > diskSize) {
                curr = songs[i];
                ct++;
            }
        }
        return ct <= cnt;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int size = kb.nextInt();
        int cnt = kb.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.print(T.solution(arr, cnt));

    }

}

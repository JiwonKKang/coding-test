package sort.p7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int[][] solution(int[][] arr) {
        Arrays.sort(arr,(a, b) -> {
            if(a[0] != b[0]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });

        return arr;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int size = kb.nextInt();

        int[][] arr = new int[size][2];

        for (int i = 0; i < size; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr[i][0] = x;
            arr[i][1] = y;
        }

        for (int[] answer : T.solution(arr)) {
            System.out.println(answer[0] + " " + answer[1]);
        }
    }

}

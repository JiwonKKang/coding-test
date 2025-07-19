package sort.p6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int[] solution(int[] arr) {
        int[] answer = new int[2];

        int[] cloned = arr.clone();

        Arrays.sort(cloned);
        boolean cs = true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != cloned[i]) {
                if (cs) {
                    answer[0] = i + 1;
                } else {
                    answer[1] = i + 1;
                }
                cs = false;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int size = kb.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = kb.nextInt();
        }
        for (int x : T.solution(arr)) {
            System.out.print(x + " ");
        }

    }
}

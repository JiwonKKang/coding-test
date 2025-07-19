package sort.p5;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public String solution(int[] arr) {
        String answer = "U";

        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            set.add(x);
        }

        if (set.size() != arr.length) {
            answer = "D";
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
        System.out.println(T.solution(arr));
    }
}

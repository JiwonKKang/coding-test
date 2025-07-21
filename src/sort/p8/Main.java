package sort.p8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int solution(int[] arr, int target) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 0;
        int rt = arr.length - 1;
        int mid;
        while (lt <= rt) {
            mid = (lt + rt) / 2;
            if(arr[mid] == target) {
                answer = mid + 1;
                break;
            }

            if(arr[mid] > target) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int size = kb.nextInt();
        int target = kb.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.print(T.solution(arr, target));
    }
}

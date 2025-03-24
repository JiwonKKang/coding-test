package string.distanceChar;

import java.util.Scanner;

public class Main {

    public int[] solution(String str, char c) {
        int d = 999;
        char[] arr = str.toCharArray();
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) {
                d = 0;
                answer[i] = d;
                continue;
            }
            d++;
            answer[i] = d;
        }
        d = 999;
        for (int j = arr.length - 1; j >= 0; j--) {
            if (arr[j] == c) {
                d = 0;
                answer[j] = d;
                continue;
            }
            d++;
            answer[j] = Math.min(answer[j], d);
        }
        return answer;
    }

    public static void main(String[] arg) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        for (int i : new Main().solution(str, c)) {
            System.out.print(i + " ");
        }
    }

}

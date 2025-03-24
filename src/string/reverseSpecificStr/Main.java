package string.reverseSpecificStr;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        char[] arr = str.toCharArray();
        int lt = 0;
        int rt = arr.length - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(arr[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(arr[rt])) {
                rt--;
            } else {
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
        }

        return String.valueOf(arr);
    }

    public static void main(String[] arg) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(new Main().solution(str));
    }

}

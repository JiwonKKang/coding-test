package string.reverseChar;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] arg) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for (int i = 0; i < n; i++) {
            String str = kb.next();
            System.out.println(new Main().solution(str));
        }
    }

}

package string.cycleString;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String removed = str.toUpperCase().replaceAll("[^A-Z]", "");
        String reverse = new StringBuilder(removed).reverse().toString();
        if (removed.equals(reverse)) return "YES";
        return "NO";
    }

    public static void main(String[] arg) {

        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(new Main().solution(str));
    }

}

package string.extractNewmeric;

import java.util.Scanner;

public class Main {

    public int solution(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if(Character.isDigit(c)) sb.append(c);
        }

        return Integer.parseInt(String.valueOf(sb));
    }

    public static void main(String[] arg) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(new Main().solution(str));
    }

}

package string.reverseStr;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String[] splitStr = str.split(" ");
        String max = splitStr[0];

        for (String s : splitStr) {
            if(max.length() < s.length()) max = s;
        }
        return max;
    }

    public static void main(String[] arg) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        String answer = new Main().solution(str);
        System.out.println(answer);
    }

}

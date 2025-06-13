package string.암호;

import java.util.Scanner;

public class Main {

    public String solution(int n, String str) {
        StringBuilder answer = new StringBuilder();
        String binaryStr = toBinary(str);
        String[] strArr = new String[n];
        for (int i = 0; i < n; i++) {
            strArr[i] = binaryStr.substring(0, 7);
            binaryStr = binaryStr.substring(7);
        }

        for (String st : strArr) {
            int decimal = toDecimal(st);
            answer.append((char) decimal);
        }

        return answer.toString();
    }

    private String toBinary(String str) {
        return str.replace("#", "1").replace("*", "0");
    }

    private int toDecimal(String str) {
        int decimal = 0;
        for (int i = 0; i < str.length(); i++) {
            char bit = str.charAt(str.length() - 1 - i);

            if (bit == '1') {
                decimal += (int) Math.pow(2, i);
            }
        }
        return decimal;
    }

    public static void main(String[] arg) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(new Main().solution(n, str));
    }

}

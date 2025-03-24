package string.findChar;

import java.util.Scanner;

public class Main {

    public int solution(String str, char t) {
        String lstr = str.toLowerCase();
        char[] arr = lstr.toCharArray();
        t = Character.toLowerCase(t);
        int cnt = 0;

        for (char e : arr) {
            if(e == t) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        int answer = T.solution(str, c);
        System.out.println(answer);
    }
}

package hashMapTreeSet.p4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public int solution(String s, String t) {
        int answer=0;
        Map<Character, Integer> tm = new HashMap<>();
        Map<Character, Integer> sm = new HashMap<>();

        //tm 초기화
        for (char c : t.toCharArray()) {
            tm.put(c, tm.getOrDefault(c, 0) + 1);
        }

        char[] sa = s.toCharArray();

        for (int i = 0; i < t.length() - 1; i++) {
            sm.put(sa[i], sm.getOrDefault(sa[i], 0) + 1);
        }

        int lt = 0;
        for (int rt = t.length() - 1; rt < s.length(); rt++) {
            sm.put(sa[rt], sm.getOrDefault(sa[rt], 0) + 1);
            if(sm.equals(tm)) answer++;
            sm.put(sa[lt], sm.get(sa[lt]) - 1);
            if(sm.get(sa[lt]) == 0) sm.remove(sa[lt]);
            lt++;
        }

        return answer;
    }


    public static void main(String[] args){
        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);
        String a=kb.next();
        String b=kb.next();
        System.out.print(T.solution(a, b));
    }
}

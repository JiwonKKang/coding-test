package hashMapTreeSet.p4;

import java.util.*;

class Main {
    public int solution(String s, String t){
        int answer = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int matched = 0;
        char [] ca = s.toCharArray();

        for (int i = 0; i < t.length() - 1; i++) {
            if (map.containsKey(ca[i])) {
                Integer value = map.get(ca[i]);
                if(value == 0) matched--;
                map.put(ca[i], --value);
                if(value == 0) matched++;
            }
        }

        int lt = 0;
        for (int rt = t.length() - 1; rt < s.length(); rt++) {
            if (map.containsKey(ca[rt])) {
                Integer value = map.get(ca[rt]);
                if(value == 0) matched--;
                map.put(ca[rt], --value);
                if(value == 0) matched++;
            }

            if(matched == map.size()) answer++;

            if(map.containsKey(ca[lt])) {
                Integer value = map.get(ca[lt]);
                if(value == 0) matched--;
                map.put(ca[lt], ++value);
                if(value == 0) matched++;
            }
            lt++;

        }

        return answer;
    }


    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String a=kb.next();
        String b=kb.next();
        System.out.print(T.solution(a, b));
    }
}

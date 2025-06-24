package hashMapTreeSet.p1;

import java.util.*;
class Main {
    public char solution(int n, String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        char answer = 'A';

        for (Character c : map.keySet()) {
            if(map.get(answer) < map.get(c)) {
                answer = c;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        String str=kb.next();
        System.out.println(T.solution(n, str));
    }
}

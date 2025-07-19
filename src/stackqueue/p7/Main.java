package stackqueue.p7;

import java.util.*;
class Main {
    public String solution(String need, String plan){
        String answer="NO";
        Queue<Character> Q=new LinkedList<>();
        for(char x : need.toCharArray()) Q.offer(x);

        char[] planArray = plan.toCharArray();

        for (int i = 0; i < planArray.length; i++) {
            if (Q.peek().equals(planArray[i])) {
                Q.poll();
                if(Q.isEmpty()) return "YES";
            } else {
                if(Q.contains(planArray[i])) return "NO";
            }
        }

        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String a=kb.next();
        String b=kb.next();
        System.out.println(T.solution(a, b));
    }
}

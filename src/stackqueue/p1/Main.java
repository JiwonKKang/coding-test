package stackqueue.p1;

import java.util.*;
class Main {
    public String solution(String str){
        String answer="YES";
        Stack<Character> st=new Stack<>();
        for (char c : str.toCharArray()) {
            if(c == '(') {
                st.push(c);
            } else {
                if(st.isEmpty()) {
                    answer = "NO";
                    break;
                }
                st.pop();
            }
        }
        if (!st.isEmpty()) {
            answer = "NO";
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}

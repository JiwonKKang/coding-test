package stackqueue.p2;

import java.util.Scanner;
import java.util.Stack;

class Main {
    public String solution(String str){
        StringBuilder answer = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c != ')') {
                st.push(c);
            } else {
                while(st.pop() != '(');
            }
        }

        int size = st.size();
        for (int i = 0; i < size; i++) {
            answer.append(st.pop());
        }

        answer.reverse();


        return answer.toString();
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}

package stackqueue.p4;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public int solution(String str) {
        Stack<Integer> st = new Stack<>();
        for (char c : str.toCharArray()) {
            if (isOperator(c)) {
                Integer op1 = st.pop();
                Integer op2 = st.pop();
                int rs = operate(c, op2, op1);
                st.push(rs);
            } else {
                st.push((int) c - 48);
            }
        }
        return st.pop();
    }

    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private int operate(char c, int op1, int op2) {
        switch (c) {
            case '+': return op1 + op2;
            case '-': return op1 - op2;
            case '*': return op1 * op2;
            case '/': return op1 / op2;
            default: return 0;
        }
    }


    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}

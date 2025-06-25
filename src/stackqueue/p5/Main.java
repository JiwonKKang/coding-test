package stackqueue.p5;

import java.util.Scanner;
import java.util.Stack;

class Main {
    public int solution(String str){
        int cnt=0;
        Stack<Character> st=new Stack<>();
        char[] ca = str.toCharArray();
        for (int i = 0; i < ca.length; i++) {
            if(ca[i] == '(') {
                st.push(ca[i]);
            } else {
                st.pop();
                if(ca[i - 1] == '(') {
                    cnt += st.size();
                } else {
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}

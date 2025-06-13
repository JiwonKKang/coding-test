package array.p3;

import java.util.*;

class Main {
    public String solution(int n, int[] a, int[] b){
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            answer.append(fight(a[i], b[i]));
        }
        return answer.toString();
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0; i<n; i++){
            a[i]=kb.nextInt();
        }
        for(int i=0; i<n; i++){
            b[i]=kb.nextInt();
        }
        for(char x : T.solution(n, a, b).toCharArray()) System.out.println(x);
    }

    public static String fight(int a, int b) {
        if (a + 1 == b) return "B";
        if (a == b) return "D";
        if(a - 2 == b) return "B";
        return "A";
    }
}

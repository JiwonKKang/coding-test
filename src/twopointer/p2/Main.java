package twopointer.p2;

import java.util.*;

class Main {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        Set<Integer> setA = new HashSet<>();
        for (int e : a) {
            setA.add(e);
        }

        for (int e : b) {
            if(setA.contains(e)) answer.add(e);
        }

        answer.sort((x, y) -> x-y);
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=kb.nextInt();
        }
        int m=kb.nextInt();
        int[] b=new int[m];
        for(int i=0; i<m; i++){
            b[i]=kb.nextInt();
        }
        for(int x : T.solution(n, m, a, b)) System.out.print(x+" ");
    }
}

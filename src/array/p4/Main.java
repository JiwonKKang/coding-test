package array.p4;

import java.util.*;

class Main {
    public int solution(int n){
        int cnt=0;
        int[] a = new int[n + 1];
        for(int i = 2; i <= n; i++) {
            if(a[i] == 0) {
                cnt++;
                for(int j = i; j <= n; j = j + i) {
                    a[j] = 1;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        System.out.println(T.solution(n));
    }
}

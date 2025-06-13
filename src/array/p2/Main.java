package array.p2;

import java.util.*;
class Main {
    public int solution(int n, int[] arr){
        int cnt = 0;
        int max = 0;

        for (int j : arr) {
            if (j <= max) {
                cnt++;
                continue;
            }
            max = j;
        }

        return arr.length - cnt;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(T.solution(n, arr));
    }
}

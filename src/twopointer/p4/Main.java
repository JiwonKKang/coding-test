package twopointer.p4;

import java.util.Scanner;

public class Main {
    public int solution(int n, int k, int[] arr){
        int answer = 0;
        int lt = 0;
        int sum = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if(sum == k) answer++;
            while(sum >= k) {
                sum -= arr[lt++];
                if (sum == k) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(T.solution(n, k, arr));
    }
}

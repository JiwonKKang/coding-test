package twopointer.p5;

import java.util.*;
class Main {
    public int solution(int n){
        int answer = 0;
        int sum = 0;
        int lt = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        for (int rt = 0; rt <= (n / 2) + 1; rt++) {
            sum += arr[rt];
            if(sum == n) answer++;
            while (sum >= n) {
                sum -= arr[lt++];
                if(sum == n) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        System.out.print(T.solution(n));
    }
}

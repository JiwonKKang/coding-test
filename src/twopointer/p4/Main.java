package twopointer.p4;

import java.util.Scanner;

public class Main {
    public int solution(int n, int k, int[] arr){
        int answer = 0;
        int lt = 0;
        int sum = 0;

        // rt 1씩 증가
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            // k와 같다면 + 1
            if(sum == k) answer++;

            // k 보다 커졌다면 작거나 같아질때까지 lt++하면서 빼기
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

package array.p8;

import java.util.*;

class Main {
    public int solution(int n, int[][] arr){
        int answer = Integer.MIN_VALUE;
        //1. 행의 합, 열의 합, 대각선의 합
        int sum1,sum2;

        for (int i = 0; i < n; i++) {
            sum1=sum2=0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            int max = Math.max(sum1, sum2);

            if (max > answer) {
                answer = max;
            }
        }
        sum1=sum2=0;

        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n-1-i];
        }

        int max2 = Math.max(sum1, sum2);

        if (max2 > answer) {
            answer = max2;
        }

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));
    }
}

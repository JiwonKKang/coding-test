package array.p10;

import java.util.*;
class Main {
    //1. 어떤 학생과 한번이라도 같은 반이되었던 횟수가 가장 많은 사람을 찾기
    //2. 일단 반복
    //3. 학년은 5학년으로 고정
    //4. 각 학생에 대해 다른 학생들과 한번이라도 같은 반이 됐었다면 cnt++ 그리고 다음학생으로 스킵

    static int MAX_CLASS = 5;
    public int solution(int n, int[][] arr){
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                if (wasSameClass(i, j, arr)) {
                    cnt++;
                }
            }

            if (max < cnt) {
                max = cnt;
                answer = i;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] arr=new int[n+1][6];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=MAX_CLASS; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));
    }

    private static boolean wasSameClass(int i, int j, int[][] arr) {
        for (int k = 1; k <= MAX_CLASS; k++) {
            if (arr[i][k] == arr[j][k]) return true;
        }
        return false;
    }
}

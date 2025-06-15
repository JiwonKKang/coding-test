package array.p9;

import java.util.*;
class Main {
    static int[] dx={-1, 0, 1, 0};
    static int[] dy={0, 1, 0, -1};

    public int solution(int n, int[][] arr){
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isTop(i, j, arr)) answer++;
            }
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

    private static boolean isTop(int i, int j, int[][] arr) {
        int nx, ny;
        int curr = arr[i][j];
        for (int k = 0; k < dx.length; k++) {
            nx = i + dx[k];
            ny = j + dy[k];

            if(nx < 0 || ny < 0 || nx >= arr.length || ny >= arr.length) continue;

            if(arr[nx][ny] >= curr) return false;
        }

        return true;
    }
}

package array.p11;

import java.util.*;
class Main {
    public int solution(int n, int m, int[][] arr){
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(isPossible(i+1, j+1, n, m, arr)) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.print(T.solution(n, m, arr));
    }

    private static boolean isPossible(int i, int j, int n, int m, int[][] arr) {
        for (int k = 0; k < m; k++) {
            int pi = -1;
            int pj = -1;
            for (int z = 0; z < n; z++) {
                if(arr[k][z] == i) pi = z;
                if(arr[k][z] == j) pj = z;
            }
            if(pi >= pj) return false;

        }
        return true;
    }
}

package stackqueue.p3;

import java.util.*;
class Main {
    public int solution(int[][] board, int[] moves){
        int answer = 0;
        Stack<Integer> st = new Stack<>();

        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                int k = board[j][move - 1];
                if (k != 0) {
                    board[j][move - 1] = 0;
                    if (!st.isEmpty() && st.peek() == k) {
                        st.pop();
                        answer += 2;
                        break;
                    } else {
                        st.push(k);
                    }
                    break;
                }
            }
        }


        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] board=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]=kb.nextInt();
            }
        }
        int m=kb.nextInt();
        int[] moves=new int[m];
        for(int i=0; i<m; i++) moves[i]=kb.nextInt();
        System.out.println(T.solution(board, moves));
    }
}

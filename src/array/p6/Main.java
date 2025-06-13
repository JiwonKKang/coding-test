package array.p6;

import java.util.*;
class Main {
    public int solution(int n, int[] arr){
        //1. 처음 맞으면 1
        //2. 연속으로 맞으면 2,3 올라감
        //즉, 연속횟수만큼 점수를 얻음

        int answer = 0;
        int stack = 0;

        for (int r : arr) {
            if (r == 1) {
                stack++;
                answer+=stack;
                continue;
            }
            stack = 0;
        }
        return answer;
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

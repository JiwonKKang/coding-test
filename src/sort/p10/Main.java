package sort.p10;

import java.util.*;
class Main {
    public int count(int[] arr, int dist){
        int cnt = 1;
        int ep = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - ep >= dist) {
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }

    public int solution(int n, int c, int[] arr){
        int answer=0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1];
        int mid;

        while (lt <= rt) {
            mid = (lt + rt) / 2;
            if (count(arr, mid) >= c) {
                lt = mid + 1;
                answer = mid;
            } else {
                rt = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int c=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        System.out.println(T.solution(n, c, arr));
    }
}

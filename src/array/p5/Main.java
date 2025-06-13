package array.p5;

import java.util.*;
class Main {

    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i : arr) {
            int res = 0;
            while (i > 0) {
                int t = i % 10;
                res = res * 10 + t;
                i = i / 10;
            }
            if (isPrime(res)) {
                answer.add(res);
            }
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
        for(int x : T.solution(n, arr)){
            System.out.print(x+" ");
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) return false;
        if(n % 2 == 0) return n == 2;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if(n % i == 0) return false;
        }
        return true;
    }
}

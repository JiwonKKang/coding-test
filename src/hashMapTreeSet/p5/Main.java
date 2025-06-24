package hashMapTreeSet.p5;

import java.util.*;
class Main {
    public int solution(int[] arr, int n, int k){
        int answer = 0;
        TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int z = j + 1; z < n; z++) {
                    ts.add(arr[i] + arr[j] + arr[z]);
                }
            }
        }

        for (int i = 0; i < k; i++) {
            Integer first = ts.pollFirst();
            if(first == null) {
                answer = -1;
                break;
            }
            answer = first;
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
        System.out.println(T.solution(arr, n, k));
    }
}

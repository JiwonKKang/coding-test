package stackqueue.p6;

import java.util.*;
class Main {
    public int solution(int n, int k){
        int answer=0;
        int cnt = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {
            Integer p = queue.poll();
            ++cnt;
            if (cnt == k) {
                cnt = 0;
                continue;
            }
            queue.offer(p);
        }
        answer = queue.poll();
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        System.out.println(T.solution(n, k));
    }
}

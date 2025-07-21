package recursivegraph.p1;

import java.util.*;
class Main {
    Queue<Integer> Q = new LinkedList<>();
    int[] moves = {1, -1, 5};
    boolean[] isVisited = new boolean[10001];

    public int BFS(int s, int e){
        Q.offer(s);
        isVisited[s] = true;
        int cnt = 0;
        while (!Q.isEmpty()) {
            int size = Q.size();
            for (int i = 0; i < size; i++) {
                Integer curr = Q.poll();
                isVisited[curr] = true;
                if (curr == e) {
                    return cnt;
                }
                for (int x : moves) {
                    int nx = curr + x;
                    if (nx > 0 && nx < 10000 && !isVisited[nx]) {
                        isVisited[nx] = true;
                        Q.offer(nx);
                    }
                }
            }
            cnt++;
        }
        return 0;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int s=kb.nextInt();
        int e=kb.nextInt();
        System.out.println(T.BFS(s, e));
    }
}

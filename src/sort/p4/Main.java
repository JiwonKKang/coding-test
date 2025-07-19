package sort.p4;

import java.util.*;

public class Main {

    public int[] solution(int cacheSize, int[] works) {
        Queue<Integer> queue = new LinkedList<>();

        for (int x : works) {
            if (queue.contains(x)) {
                queue.remove(x);
                queue.offer(x);
                if(queue.size() > cacheSize) {
                    queue.poll();
                }
                continue;
            }
            queue.offer(x);
            if(queue.size() > cacheSize) {
                queue.poll();
            }
        }

        int[] answer = new int[cacheSize];

        for (int i = queue.size() - 1; i >= 0; i--) {
            answer[i] = queue.poll();
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int cacheSize = kb.nextInt();
        int inputSize = kb.nextInt();

        int[] arr = new int[inputSize];
        for (int i = 0; i < inputSize; i++) {
            arr[i] = kb.nextInt();
        }
        for (int x : T.solution(cacheSize, arr)) {
            System.out.print(x + " ");
        }
    }

}

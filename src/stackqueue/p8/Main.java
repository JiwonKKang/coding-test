package stackqueue.p8;

import java.util.*;

public class Main {

    public static class Person {
        private final int order;
        private final int priority;

        public Person(int order, int priority) {
            this.order = order;
            this.priority = priority;
        }
    }

    public int solution(int[] array, int m) {
        Queue<Person> queue = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            queue.offer(new Person(i, array[i]));
        }

        int cnt = 0;
        while (!queue.isEmpty()) {
            Person current = queue.poll();

            boolean hasHigherPriority = false;
            for (Person p : queue) {
                if (p.priority > current.priority) {
                    hasHigherPriority = true;
                    break;
                }
            }

            if (hasHigherPriority) {
                // 더 위험한 환자가 있으면 맨 뒤로 보냄
                queue.offer(current);
            } else {
                // 진료 받음
                cnt++;
                if (current.order == m) {
                    return cnt;
                }
            }
        }

        return cnt;
    }

    public static void main(String[] arg) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = kb.nextInt();
        }
        System.out.println(T.solution(array, m));
    }
}

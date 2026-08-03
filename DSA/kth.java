import java.util.PriorityQueue;
import java.util.Collections;

public class LastStoneWeight {

    public static int lastStoneWeight(int[] stones) {

        // Max Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Add all stones
        for (int stone : stones) {
            pq.add(stone);
        }

        // Smash the two heaviest stones
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();

            if (first != second) {
                pq.add(first - second);
            }
        }

        if (pq.isEmpty()) {
            return 0;
        }

        return pq.poll();
    }

    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};

        int ans = lastStoneWeight(stones);
        System.out.println(ans);
    }
}
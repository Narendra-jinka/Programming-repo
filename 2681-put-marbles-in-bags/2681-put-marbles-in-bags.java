class Solution {
    public long putMarbles(int[] weights, int k) {
        PriorityQueue<Long> pq1 = new PriorityQueue<>();
        PriorityQueue<Long> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        long max = (long) weights[0] + weights[weights.length - 1];
        long min = (long) weights[0] + weights[weights.length - 1];

        for (int i = 0; i < weights.length - 1; i++) {
            pq1.add((long) weights[i] + weights[i + 1]);
            pq2.add((long) weights[i] + weights[i + 1]);
        }

        int count = k;
        while (count > 1 && !pq1.isEmpty()) {
            // System.out.println("pq1 is :" + pq1.peek());
            // System.out.println("pq2 is :" + pq2.peek());
            min += pq1.poll();
            max += pq2.poll();
            count--;
        }

        return max - min;
    }
}
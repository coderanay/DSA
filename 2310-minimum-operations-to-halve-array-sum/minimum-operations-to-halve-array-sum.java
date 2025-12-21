class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        double sum = 0;
        for (int num : nums) {
            sum += num;
            pq.add((double) num);
        }

        double target = sum / 2;
        int cnt = 0;
        while (sum > target) {
            double val = pq.poll();
            double half = val / 2;
            sum -= half;
            pq.add(half);
            cnt++;
        }
        return cnt;
    }
}

class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));
        for (int[] arr : classes) {
            int pass = arr[0];
            int total = arr[1];
            double diff = findDiff(pass, total);
            pq.offer(new double[]{diff, pass, total});
        }

        while (extraStudents-- > 0) {
            double[] arr = pq.poll();
            int pass = (int) arr[1] + 1;
            int total = (int) arr[2] + 1;
            double diff = findDiff(pass, total);
            pq.offer(new double[]{diff, pass, total});
        }
        double totalPassRatio = 0;
        while (!pq.isEmpty()) {
            double[] arr = pq.poll();
            int pass = (int) arr[1];
            int total = (int) arr[2];
            totalPassRatio += (double) pass / total;
        }

        return totalPassRatio / classes.length;
    }

    private double findDiff(int pass, int total) {
        return ((double)(pass + 1) / (total + 1)) - ((double) pass / total);
    }
}

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int[][] res = new int[n + 1][2];

        for (int i = 0; i < n; i++) {
            res[i][0] = intervals[i][0];
            res[i][1] = intervals[i][1];
        }

        res[n][0] = newInterval[0];
        res[n][1] = newInterval[1];
        if (res.length == 0) return new int[0][];

        Arrays.sort(res, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> res1= new ArrayList<>();

        int start1 = res[0][0];
        int end1 = res[0][1];

        for (int i = 1; i < res.length; i++) {
            int start2 = res[i][0];
            int end2 = res[i][1];

            if (end1 >= start2) {
                end1 = Math.max(end1, end2);
            } else {
                res1.add(new int[]{start1, end1});
                start1 = start2;
                end1 = end2;
            }
        }
        res1.add(new int[]{start1, end1});
        return res1.toArray(new int[res1.size()][]);
    }
}
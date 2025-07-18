class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        int n = values.length;
        long score = 0;
        int i = 0;
        boolean[] visited = new boolean[n];
        while (i < n && i>=0 && !visited[i]) {
            String str = instructions[i];
            visited[i] = true;
            if (str.equals("add")) {
                score += values[i];
                i += 1;
            } else if (str.equals("jump")) {
                i += values[i];
            }
        }

        return score;
    }
}

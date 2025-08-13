import java.util.*;

class Solution {
    public int carFleet(int target, int[] arr, int[] speed) {
        int n = speed.length;
        double[] time = new double[n];
        for (int i = 0; i < n; i++) {
            time[i] = (double)(target - arr[i]) / speed[i];
        }
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = i;
        Arrays.sort(idx, (a, b) -> Integer.compare(arr[b], arr[a]));
        for(int i: idx) System.out.print(i);
        int count = 0;
        double lastTime = 0;
        for (int i = 0; i < n; i++) {
            double currTime = time[idx[i]];
            if (currTime > lastTime) {
                count++;
                lastTime = currTime;
            }
        }

        return count;
    }
}

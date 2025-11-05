import java.util.*;

class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] res = new long[n];
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        // Step 1: Group indices by value
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        
        for (List<Integer> list : map.values()) {
            int size = list.size();
            long[] prefix = new long[size + 1];
            
            for (int i = 0; i < size; i++) {
                prefix[i + 1] = prefix[i] + list.get(i);
            }
            
            for (int i = 0; i < size; i++) {
                int idx = list.get(i);
                long leftSum = (long)i * list.get(i) - prefix[i];
                long rightSum = (prefix[size] - prefix[i + 1]) - (long)(size - i - 1) * list.get(i);
                res[idx] = leftSum + rightSum;
            }
        }
        
        return res;
    }
}

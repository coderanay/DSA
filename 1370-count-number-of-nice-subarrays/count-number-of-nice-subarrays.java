class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int odd = 0, res = 0;
        for (int num : nums) {
            if (num % 2 == 1) odd++;
            res += map.getOrDefault(odd - k, 0);
            map.put(odd, map.getOrDefault(odd, 0) + 1);
        }
        return res;
    }
}

class Solution {
    public static int rev(int x){
        int neww = 0;
        while (x > 0) {
            int rem = x % 10;
            neww = neww * 10 + rem;
            x /= 10;
        }
        return neww;
    }

    public int countNicePairs(int[] nums) {
        int mod = 1_000_000_007;
        Map<Integer, Integer> map = new HashMap<>();
        long count = 0;

        for (int num : nums) {
            int key = num - rev(num);
            count = (count + map.getOrDefault(key, 0)) % mod;
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        return (int) count;
    }
}

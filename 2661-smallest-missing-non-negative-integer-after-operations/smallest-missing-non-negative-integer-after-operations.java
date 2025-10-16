class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        List<Integer> al = new ArrayList<>();

        for (int num : nums) {
            int rem = ((num % value) + value) % value;
            mp.put(rem, mp.getOrDefault(rem, 0) + 1);
        }

       int mex = 0;
        while (mp.getOrDefault(mex % value, 0) > 0) {
            mp.put(mex % value, mp.get(mex % value) - 1);
            mex += 1;
        }
        return mex;
    }
}

class Solution {

    public void backtrack(Set<List<Integer>> set, int[] nums, int i, List<Integer> temp) {
        if (i == nums.length) {
            List<Integer> copy = new ArrayList<>(temp);
            Collections.sort(copy);
            set.add(copy);
            return;
        }
        temp.add(nums[i]);
        backtrack(set, nums, i + 1, temp);
        temp.remove(temp.size() - 1);
        backtrack(set, nums, i + 1, temp);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Set<List<Integer>> set = new HashSet<>();
        List<Integer> temp = new ArrayList<>();

        backtrack(set, nums, 0, temp);

        return new ArrayList<>(set);
    }
}

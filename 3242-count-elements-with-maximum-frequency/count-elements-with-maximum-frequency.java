class Solution {
    public int maxFrequencyElements(int[] nums) {
    HashMap<Integer, Integer> m = new HashMap<>();
    for(int i: nums) {
        m.put(i, m.getOrDefault(i, 0) + 1);
    }
    int max = 0, ans = 0;      
    for(Map.Entry<Integer, Integer> e: m.entrySet()) {
        max = Math.max(max, e.getValue());
    }
    for(Map.Entry<Integer, Integer> e: m.entrySet()) {
        ans = (e.getValue() == max) ? ans += max: ans;
    }
    return ans;
    }

}
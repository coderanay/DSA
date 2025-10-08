class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] arr = spells.clone();
        Arrays.sort(potions);
        Arrays.sort(spells);
        int n = spells.length, m = potions.length, j= m-1;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++) {
            while(j>=0 && (1L * spells[i] * potions[j]) >= success) j--;
            mp.put(spells[i], m-1-j);
        }
        int[] ans = new int[n];
        for(int i=0;i<n;i++) {
            ans[i] = mp.get(arr[i]);
        }
        return ans;
    }
}
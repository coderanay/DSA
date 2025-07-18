class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        Set<Integer> primes = new HashSet<>(Arrays.asList(
    2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
    31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
    73, 79, 83, 89, 97
));

        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e: map.entrySet())
        {
            if(primes.contains(e.getValue())) return true;
        } //19, 23, 29, 31, 37, 41, 43, 47
        return false;
    }
}
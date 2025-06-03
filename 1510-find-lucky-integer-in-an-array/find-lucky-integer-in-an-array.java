class Solution {
    public int findLucky(int[] arr) {
        int maxOfThem = -1;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e: hm.entrySet())
        {
            int value = 0;
            if(e.getKey() == e.getValue()) {
                maxOfThem = 
                value = e.getKey();
                maxOfThem = Math.max(maxOfThem,value);
            }
        }
        return maxOfThem;
    }
}
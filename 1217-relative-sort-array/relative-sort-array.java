class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<arr1.length;i++)
        {
            map.put(arr1[i], map.getOrDefault(arr1[i],0)+1);
        }
        for(int x: arr2)
        {
            
            while(map.get(x) > 0 && map.containsKey(x)) 
            {
                al.add(x);
                map.put(x,map.get(x)-1);
            }
        }

        List<Integer> remaining = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int key = e.getKey(), val = e.getValue();
            while (val-- > 0) {
                remaining.add(key);
            }
        }

        Collections.sort(remaining);
        al.addAll(remaining);
        return al.stream().mapToInt(k->k).toArray();
    }
}
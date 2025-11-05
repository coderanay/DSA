class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(nums[i] < 0)
            {
                a.add(nums[i]);
            } else b.add(nums[i]);
        }
        if(a.size()== 0)
        {
            for(int i=0;i<b.size();i++)
            {
                b.set(i,b.get(i)*b.get(i));
            }
            return b.stream().mapToInt(k->k).toArray();
        } else if(b.size() == 0)
        {
            for(int i=0;i<a.size();i++)
            {
               a.set(i,a.get(i)*a.get(i));
            }
            Collections.reverse(a);
            return a.stream().mapToInt(k->k).toArray();
        }
        for(int i=0;i<a.size();i++) 
        {
            a.set(i,a.get(i)*a.get(i));
        }
        Collections.reverse(a);
        for(int i=0;i<b.size();i++) b.set(i,b.get(i)*b.get(i));
        int i=0,j=0,idx=0;
        while(i < a.size() && j < b.size())
        {
            if(a.get(i) <= b.get(j))
            {
                nums[idx++] = a.get(i);
                i++;
            } else if(b.get(j) <= a.get(i))
            {
                nums[idx++] = b.get(j);
                j++;
            }
        }
        while(i < a.size())
        {
            nums[idx++] = a.get(i);
            i++;
        }
        while(j < b.size())
        {
            nums[idx++] = b.get(j);
            j++;
        }
        return nums;
    }
}
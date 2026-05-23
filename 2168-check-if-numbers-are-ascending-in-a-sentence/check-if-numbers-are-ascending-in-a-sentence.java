class Solution {
    public boolean areNumbersAscending(String s) {
        List<Integer> ans=new ArrayList<>();
        String[] arr = s.split(" ");
        for(int i=0;i<arr.length;i++)
        {
           try 
           {
            if(true)
            {
                ans.add(Integer.parseInt(arr[i]));
            }
           } catch(NumberFormatException e)
           {
            continue;
           }
        }
        for(int i=0;i<ans.size()-1;i++)
        {
            if(ans.get(i) >= ans.get(i+1))
            {
                return false;
            }
        }
        return true;
    }
}
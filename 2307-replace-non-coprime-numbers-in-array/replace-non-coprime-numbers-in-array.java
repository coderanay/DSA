class Solution {
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;   
    }
    public static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Long> st=new Stack<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            long num = nums[i];
            while(!st.isEmpty() && gcd(num,st.peek()) > 1)
            {
                num =(long)lcm(st.peek(),num);
                st.pop();
            }
            st.push(num);
        }
        long[] arr = new long[st.size()];
        int idx = st.size()-1;
        while(!st.isEmpty())
        {
            arr[idx--] = st.pop(); 
        }
        for(long x: arr) ans.add((int)x);
        return ans;
    }
}



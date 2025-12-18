class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int num: piles) pq.add(num);
        int sum = 0;
        while(k-- > 0)
        {
            int x = pq.poll();
            int val = x - (int)Math.floor(x/2);
            pq.add(val);
        }

        while(!pq.isEmpty())
        {
            sum += pq.poll();
        }

        return sum;
    }
}
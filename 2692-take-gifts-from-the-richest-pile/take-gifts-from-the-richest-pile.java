class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int num: gifts)
        {
            pq.add(num);
        }
        int sqrt=1;
        while(k-- > 0)
        {
            int val =  pq.poll();
             sqrt = (int)Math.sqrt(val);
            pq.add(sqrt);
        }
        long sum = 0;
        while(!pq.isEmpty())
        {
            sum += pq.poll();
        }
        return sum;
    }
}
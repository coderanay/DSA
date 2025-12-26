class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;
        for(int num: happiness)
        {
            pq.add(num);
        }
        int dec = 0;
        while(k > 0 && !pq.isEmpty())
        {
            int val = pq.poll();
            val -= dec;
            if(val > 0) sum += (long)val;
            dec++;
            k--;
        }
        return sum;
    }
}
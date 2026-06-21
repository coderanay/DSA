class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count =0;
        for(int i: costs){
            if(coins-i>=0){
                coins-=i;
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}
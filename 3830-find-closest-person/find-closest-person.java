class Solution {
    public int findClosest(int x, int y, int z) {
        int distPerson1 = Math.abs(z - x);
        int distPerson2 = Math.abs(z - y);
        if(distPerson1 < distPerson2) {
            return 1;
        } else if (distPerson2 < distPerson1) {
            return 2;
        } else {
            return 0;
        }
        
    }
}
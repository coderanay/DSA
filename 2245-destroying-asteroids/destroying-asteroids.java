class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long d = mass;
        for(int asteroid: asteroids) {
            if(d < asteroid) return false;
            d += asteroid;
        }
        return true;
    }
}
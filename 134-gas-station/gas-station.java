class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalGas = 0, totalCost = 0;
        for (int i = 0; i < n; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if (totalGas < totalCost) return -1; // impossible

        int tank = 0;      
        int start = 0;     // candidate start index
        for (int i = 0; i < n; i++) {
            tank += gas[i] - cost[i];
            if (tank < 0) {    // cannot start from current 'start'
                start = i + 1; // try next station as start
                tank = 0;      // reset tank
            }
        }
        return start;
    }
}

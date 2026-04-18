class Solution {
    public double calculateTax(int[][] brackets, int income) {
        if (income == 0) {
            return 0.00000;
        }

        double tax = 0.0;
        double h = 100.0;
        int n = brackets.length;

        tax += (double)(Math.min(income, brackets[0][0]) * brackets[0][1]) / h;

        for (int i = 1; i < n; i++) {
            int dollar = Math.min(income, brackets[i][0]) - brackets[i - 1][0];

            if (dollar > 0) 
            {
                tax += (double)(dollar * brackets[i][1]) / h;
            }

            if (income <= brackets[i][0]) 
            {
                break;
            }
        }
        return tax;
    }
}
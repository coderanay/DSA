class Solution {
    public int largestInteger(int num) {
        List<Integer> digits = new ArrayList<>();
        int temp = num;
        while (temp > 0) {
            digits.add(temp % 10);
            temp /= 10;
        }
        Collections.reverse(digits);
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int d : digits) {
            if (d % 2 == 0) even.add(d);
            else odd.add(d);
        }
        Collections.sort(even, Collections.reverseOrder());
        Collections.sort(odd, Collections.reverseOrder());
        int evenIdx = 0, oddIdx = 0;
        int result = 0;
        for (int d : digits) {
            result = result * 10 + ((d % 2 == 0) ? even.get(evenIdx++) : odd.get(oddIdx++));
        }

        return result;
    }
}

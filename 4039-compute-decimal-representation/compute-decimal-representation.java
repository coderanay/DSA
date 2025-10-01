class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> al=new ArrayList<>();
        int cnt=0;
        while(n > 0)
        {
            int digit = n%10;
            double pow = Math.pow(10,cnt++);
            digit *= pow;
            if(digit != 0) al.add(digit);
            System.out.println(digit);
            n /= 10;
        }
        Collections.sort(al,Collections.reverseOrder());
        return al.stream().mapToInt(k->k).toArray();
    }
}
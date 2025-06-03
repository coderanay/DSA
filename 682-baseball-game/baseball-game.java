class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list=new ArrayList<>();
        int n = operations.length;
        for (String op : operations) {
            if (op.equals("+")) {
                int size = list.size();
                int sum = list.get(size - 1) + list.get(size - 2);
                list.add(sum);
            } else if (op.equals("D")) {
                int last = list.get(list.size() - 1);
                list.add(2 * last);
            } else if (op.equals("C")) {
                list.remove(list.size() - 1);
            } else {
                list.add(Integer.parseInt(op));
            }
        }
        int total = 0;
        for(int num: list) {
            total += num;
        }
        return total;
    }
}
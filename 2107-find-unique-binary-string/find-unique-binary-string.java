class Solution {
    public String findDifferentBinaryString(String[] nums) {
        String str = "";
        for(int i=0;i<nums.length;i++) {
            if(nums[i].charAt(i) == '0') {
                str += '1';
            } else {
                str += '0';
            }
        }
        return str;
    }
}
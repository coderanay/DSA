import java.util.*;

class Solution {
    public List<String> partitionString(String s) {

        Set<String> seen = new HashSet<>();
        List<String> ans = new ArrayList<>();

        int n = s.length();
        int i = 0;

        while (i < n) {

            String curr = "";
            while (i < n) {

                curr += s.charAt(i);

                if (!seen.contains(curr)) {
                    seen.add(curr);
                    ans.add(curr);
                    i++;
                    break;
                }

                i++;
            }
        }

        return ans;
    }
}
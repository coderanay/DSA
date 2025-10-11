class Solution {
    public boolean closeStrings(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        if(n != m) return false;
        Set<Character> set1=new HashSet<>();
        Set<Character> set2=new HashSet<>();
        char[] arr1 =word1.toCharArray();
        char[] arr2 =word2.toCharArray();
        for(char c: arr1) set1.add(c);
        for(char c: arr2) set2.add(c);
        List<Character> l1=new ArrayList<>(set1);
        List<Character> l2=new ArrayList<>(set2);
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Collections.sort(l1);
        Collections.sort(l2);
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(int i=0,j=0;i<n&&j<m;i++,j++)
        {
            char c1 = arr1[i];
            char c2 = arr2[j];
            map1.put(c1, map1.getOrDefault(c1,0)+1);
            map2.put(c2, map2.getOrDefault(c2,0)+1);
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0,j=0;i<l1.size()&&j<l2.size();i++,j++)
        {
            list1.add(map1.get(l1.get(i)));
            list2.add(map2.get(l2.get(j)));
        }
        Collections.sort(list1);
        Collections.sort(list2);
        for(int x: list1) System.out.println(x);
        for(int x: list2) System.out.println(x);
        for(int i=0,j=0;i<list1.size() && j < list2.size();i++,j++)
        {
            int a = list1.get(i);
            int b = list2.get(j);
            char c1 = l1.get(i);
            char c2 = l2.get(j);
            if(c1 != c2) return false;
            if(a > b || b > a) return false;
            if(a == 0 || b == 0) return false;
        }
        return true;
    } 
}
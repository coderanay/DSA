class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        ArrayList<String> al=new ArrayList<>();
        int n = folder.length;
        al.add(folder[0]);
        int ptr=0;
        for(int i=1;i<n;i++)
        {
            String str= folder[i];
            String prev = al.get(ptr) + "/";
            if(!str.startsWith(prev))
            {
                al.add(str);
                ptr++;
            }
        }
        return al;
    }
}
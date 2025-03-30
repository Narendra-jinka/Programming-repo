class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<>();
        int start=0;
        int last=0;
        int n =s.length();
        for(int i=0;i<n;i++){
            if(i>last){
                list.add(last-start+1);
                start = i;
                last=0;
            }
            int curLast = s.lastIndexOf(s.charAt(i));
            if(curLast >=last){
                last=curLast;
            }
            
        }
        list.add(last-start+1);
        return list;
    }
}
class Solution {
    public int countGoodSubstrings(String s) {
        HashSet<Character> set=new HashSet<>();
        int start=0;
        int res=0;
        for(int end=0;end<s.length();end++){
            char c=s.charAt(end);
            while(set.contains(c) || set.size()==3){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(c);
            if(set.size()==3){
                res++;
            }
        }
        return res;
    }
}
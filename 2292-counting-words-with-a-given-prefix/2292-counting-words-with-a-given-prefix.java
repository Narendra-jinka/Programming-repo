class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(String s:words){
            int i=0;
            while(i<pref.length() && i<s.length()){
                if(s.charAt(i)!=pref.charAt(i)) break;
                i++;
            }
            if(i==pref.length()) count++;
        }
        return count;
    }
}
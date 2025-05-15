class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> res = new ArrayList<>();
        for(int i=0;i<groups.length;i++){
            if(i==0) res.add(words[i]);
            else{
                if(groups[i]!=groups[i-1]) res.add(words[i]);
            }
        }
        return res;
    }
}
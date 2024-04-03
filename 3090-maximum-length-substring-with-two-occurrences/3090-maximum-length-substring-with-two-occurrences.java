class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int start=0;
        int ans=0;
        for(int end=0;end<s.length();end++){
            char c=s.charAt(end);
            map.put(c, map.getOrDefault(c, 0) + 1);
            while(map.get(c)>2){
                char startchar=s.charAt(start);
                int val=map.get(startchar)-1;
                if(val==0){
                    map.remove(startchar);
                }
                else{
                    map.put(startchar,val);
                }
                start++;
            }
            ans=Math.max(ans,end-start+1);    
        }
        return ans;
    }
}
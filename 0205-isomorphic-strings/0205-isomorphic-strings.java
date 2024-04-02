class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            char r=t.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,r);
            }
            else{
                if(r!=map.get(c)){
                    return false;
                }
            }
        }
        HashSet<Character> set=new HashSet<>();
        for(Map.Entry<Character,Character> e: map.entrySet()){
            if(!set.contains(e.getValue())){
                set.add(e.getValue());
            }
            else{
                return false;
            }
        }
        
        return true;
    }
}
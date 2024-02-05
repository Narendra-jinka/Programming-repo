import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            char cur=s.charAt(i);
            map.put(cur,map.getOrDefault(cur,0)+1);
        }
        for(char c:s.toCharArray()){
            if(map.get(c) == 1){
                return s.indexOf(c);
            }
        }
        return -1;
        
    }
}
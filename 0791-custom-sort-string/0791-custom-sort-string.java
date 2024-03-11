class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,String> map=new HashMap<>();
        for(char c:s.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c,c+"");
            }
            else{
                String str=map.get(c);
                map.put(c,str+(c+""));
            }
        }
        StringBuffer sb=new StringBuffer();
        for(char c:order.toCharArray()){
            if(map.containsKey(c)){
                sb.append(map.get(c));
                map.remove(c);
            }
        }
        
        
        for(Map.Entry<Character,String> e:map.entrySet()){
            sb.append(e.getValue());
        }
        return sb.toString();
    }
}
class Solution {
    public int minimumLength(String s) {
        if(s.length()<=2) return s.length();
        int len=0;
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            if(e.getValue()>2){
                if(e.getValue()%2==0) len+=2;
                else len+=1;
            }
            else{
                len+=e.getValue();
            }
        }
        
        return len;
        
    }
}
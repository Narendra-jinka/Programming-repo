class Solution {
    public int countGoodSubstrings(String s) {
        int count=0,n=s.length();
        HashMap<Character , Integer> map = new HashMap<>();
        int i=0,j=0;
        while(j<n){
            char c=s.charAt(j);
            map.put(c,map.getOrDefault(c,0)+1);
            if(j-i+1 == 3) {  
                if(map.size() == 3) {
                    count++;
                }
                    char ch=s.charAt(i);
                    int k=map.get(ch);k--;
                    if(k==0){
                        map.remove(ch);
                    }
                    else{
                        map.put(ch,k);
                    }
                i++;
            }
            j++;
        }
        return count;
    }
}
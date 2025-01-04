class Solution {
    public int countPalindromicSubsequence(String s) {
        int n=s.length();
        if(n<3){
            return 0;
        }
       
        
        // for(int i=0;i<n;i++){
        //     char c=s.charAt(i);
        //     if(map.containsKey(c)){
        //         int start = map.get(c)+1;
        //         int end=i;
        //         while(start<end){
        //             String str=""+c+s.charAt(start)+c;
        //             set.add(str);
        //             start++;
        //         }
        //     }
        //     else{
        //         map.put(c,i);
        //     }
        // }
        int count=0;
        for(char c='a';c<='z';c++){
            int start = s.indexOf(c)+1;
            int end = s.lastIndexOf(c);
            HashSet<Character> set=new HashSet<>();
            while(start<end){
                set.add(s.charAt(start));
                start++;
            }
            count+=set.size();
        }

        return count;
    }
}
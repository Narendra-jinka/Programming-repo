class Solution {
    public int countPalindromicSubsequence(String s) {
        int n=s.length();
        if(n<3){
            return 0;
        }
        int count;
        HashMap<Character,Integer> map=new HashMap<>();
        HashSet<String> set=new HashSet<>();
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

        for(char c='a';c<='z';c++){
            int start = s.indexOf(c)+1;
            int end = s.lastIndexOf(c);
            while(start<end){
                String str = ""+c+s.charAt(start)+c;
                set.add(str);
                start++;
            }
        }

        return set.size();
    }
}
class Solution {

    public boolean isPrefix(String w1, String w2){
        if(w1.length() > w2.length()) return false;
        
        for(int i=0;i<w1.length();i++){
            if(w1.charAt(i)!= w2.charAt(i)) return false;
        }

        return true;
    }
    public boolean isSufix(String w1, String w2){
        if(w1.length() > w2.length()) return false;
        int i=w1.length()-1;
        int j=w2.length()-1;
        while(i>=0 && j>=0){
            if(w1.charAt(i) != w2.charAt(j)) return false;
            i--;j--;
        } 

        return true;
    }
    public int countPrefixSuffixPairs(String[] words) {
        int n=words.length;
        int count =0 ;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                boolean ps = isPrefix(words[i],words[j]);
                boolean ss = isSufix(words[i],words[j]);
                if(ps && ss) count++;
            }
        }
        return count;
    }
}
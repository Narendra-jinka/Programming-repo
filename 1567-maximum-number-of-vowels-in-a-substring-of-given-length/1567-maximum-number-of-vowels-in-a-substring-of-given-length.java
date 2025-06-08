class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int cntVowel = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            char ch = s.charAt(i);
            if(isVowel(ch)){
                cntVowel++;
            }
        }
        maxi = Math.max(maxi,cntVowel);
        for(int i=k;i<n;i++){
            char ch = s.charAt(i);
            if(isVowel(ch)){
                cntVowel++;
            }
            if(isVowel(s.charAt(i-k))){
                cntVowel--;
            }
             maxi = Math.max(maxi,cntVowel);
        }

        return maxi;
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); // Convert to lowercase to make it case-insensitive
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
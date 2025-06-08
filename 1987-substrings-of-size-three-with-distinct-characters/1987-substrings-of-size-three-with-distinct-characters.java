// class Solution {
//     public int countGoodSubstrings(String s) {
//         int count=0,n=s.length();
//         HashMap<Character , Integer> map = new HashMap<>();
//         int i=0,j=0;
//         while(j<n){
//             map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
//             if(j-i+1 == 3) {  
//                 if(map.size() == 3) {
//                     count++;
//                 }
//                     int k=map.get(s.charAt(i));k--;
//                     if(k==0){
//                         map.remove(s.charAt(i));
//                     }
//                     else{
//                         map.put(s.charAt(i),k);
//                     }
//                 i++;
//             }
//             j++;
//         }
//         return count;
//     }
// }


class Solution {
    public int countGoodSubstrings(String s) {
        int ans = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            String substring = s.substring(i, i + 3);
            if (substring.chars().distinct().count() == 3) {
                ans++;
            }
        }
        return ans;
    }
}
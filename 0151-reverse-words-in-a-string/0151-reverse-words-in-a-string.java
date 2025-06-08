// class Solution {
//     public String reverseWords(String s) {
//         int i=0;
//         int j=0;
//         StringBuilder sb = new StringBuilder();
//         s=s.trim();
//         int n=s.length();
//         while(j<n){
//             if(s.charAt(j)==' '){
//                 if(i!=j){
//                     sb.insert(0," "+s.substring(i,j));
//                     i=j+1;
//                 }
//                 else{
//                     i++;
//                 } 
//             }
//             j++; 
//         }
//         sb.insert(0,s.substring(i,n));
//         return sb.toString();
//     }
// }

class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder res = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            res.append(words[i]);
            if (i != 0) {
                res.append(" ");
            }
        }

        return res.toString().trim();
    }
}
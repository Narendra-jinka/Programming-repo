// class Solution {
//     public String makeSmallestPalindrome(String s) {
//         // int n=s.length();
//         // int i=0;
//         // int j=n-1;
//         // StringBuilder sb = new StringBuilder(s);
//         // while(i<j){
//         //     char start = sb.charAt(i);
//         //     char end = sb.charAt(j);
            
//         //     if(start!=end){
//         //         if(start < end){
//         //             sb.setCharAt(j,start);
//         //         }
//         //         else{
//         //             sb.setCharAt(i,end);
//         //         }
//         //     }
//         //     i++;j--;
//         // }
//         // return sb.toString();
//         StringBuilder sb = new StringBuilder(s);
//         int i = 0, j = sb.length() - 1;

//         while (i < j) {
//             if (sb.charAt(i) != sb.charAt(j)) {
//                 // Always pick the smaller character to make it lexicographically smallest
//                 char smaller = (char) Math.min(sb.charAt(i), sb.charAt(j));
//                 sb.setCharAt(i, smaller);
//                 sb.setCharAt(j, smaller);
//             }
//             i++;
//             j--;
//         }
//         return sb.toString();
//     }
// }
class Solution {
    public String makeSmallestPalindrome(String s) {
    char[] arr = s.toCharArray();
    int left = 0, right = arr.length - 1;
    int ops = 0;
    while (left < right) {
        if (arr[left] != arr[right]) {
            if (arr[left] > arr[right]) {
                arr[left] = arr[right];
            } else {
                arr[right] = arr[left];
            }
            ops++;
        }
        left++;
        right--;
    }
    if (ops == 0) {
        return s;
    }
    return new String(arr);
}
}
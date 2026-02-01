// class Solution {
//     public int removeDuplicates(int[] nums) {
//         if(nums.length==0) return 0;
//         if(nums.length==1) return 1; 
//         int ri = 0;
//         int le = nums[0];
//         for(int i=1;i<nums.length;i++){
//             if(nums[i] != le){
//                 nums[++ri] = nums[i]; 
//                 le = nums[i];
//             }
//         }

//         return ri+1;
//     }
// }

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[j - 1]) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}

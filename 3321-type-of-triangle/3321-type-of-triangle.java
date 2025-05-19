class Solution {
    public String triangleType(int[] nums) {
        // if(nums[0]+nums[1]<=nums[2] || nums[0]+nums[2]<=nums[1] || nums[1]+nums[2] <=nums[0]) return "none";
        // else if(nums[0]==nums[1] && nums[1]==nums[2]) return "equilateral";
        // else if(nums[0]==nums[1] || nums[1]==nums[2] || nums[0]==nums[2]) return "isosceles";
        // else return "scalene";

        int a = nums[0], b = nums[1], c = nums[2];

        if (a + b <= c || a + c <= b || b + c <= a) {
            return "none";
        }
        if (a == b && b == c) {
            return "equilateral";
        } else if (a == b || b == c || a == c) {
            return "isosceles";
        } else {
            return "scalene";
        }
        
    } 
}
class Solution {
    public int heightChecker(int[] heights) {
       /* 
        int[] arr = Arrays.copyOf(heights,heights.length);
        
        Arrays.sort(arr);
        
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=heights[i]) count++;
        }
        
        return count;
        
        */
        
        
        // time opimized 
        
        int[] count = new int[101];

        // Count the occurrences of each height
        for (int height : heights) {
            count[height]++;
        }

        int index = 0;
        int missMatch = 0;

        // Reconstruct the sorted array and compare with the original
        for (int height = 1; height < count.length; height++) {
            while (count[height] > 0) {
                if (heights[index] != height) {
                    missMatch++;
                }
                index++;
                count[height]--;
            }
        }

        return missMatch;
        
        
        
    }
}
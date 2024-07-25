class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:nums){
            pq.add(i);
        }
        
         int index = 0;
        while (!pq.isEmpty()) {
            nums[index++] = pq.poll();
        }
        
        return nums;
    }
}
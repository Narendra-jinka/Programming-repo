class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                long res =((long)nums1[i])*nums2[j];
                pq.add(res);
            }
        }
        long x=k;

        while(x>1){
            pq.poll();
            x--;
        }
        return pq.poll();
    }
}
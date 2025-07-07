class Solution {
    public int maxEvents(int[][] e) {
        Arrays.sort(e,(a,b)->Integer.compare(a[0],b[0]));
        int n=e.length;
        int i=0;
        int max = 0;
        for(int[] ev:e){
            max = Math.max(ev[1],max);
        }
        int res=0;
        PriorityQueue<Integer> q= new PriorityQueue<>();
        for(int d=1;d<=max;d++){
            while(i<n && e[i][0]==d) {
                q.offer(e[i][1]);
                i++;
            }
            while(!q.isEmpty() && q.peek()<d){
                q.poll();
            }
            if(!q.isEmpty()){
                q.poll();
                res++;
            }
            if(i==n && q.isEmpty()) break;
        }
        return res;
    }
}
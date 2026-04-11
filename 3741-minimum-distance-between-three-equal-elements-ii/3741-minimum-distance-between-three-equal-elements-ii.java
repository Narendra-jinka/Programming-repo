class Solution {
    public int minimumDistance(int[] nums) {
        // int res = Integer.MAX_VALUE;

        // HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        // }
        // for(Map.Entry<Integer, ArrayList<Integer>> entry:map.entrySet()){
        //     List<Integer> indices = entry.getValue();
        //     if (indices.size() < 3)
        //         continue;
        //     for (int i = 0; i < indices.size() - 2; i++) {
        //         int dist = (indices.get(i + 1) - indices.get(i)) +
        //                 (indices.get(i + 2) - indices.get(i + 1)) +
        //                 (indices.get(i + 2) - indices.get(i));
        //         res = Math.min(res, dist);
        //     }

        // }
        // if(res == Integer.MAX_VALUE) res = -1;
        // return res;

         Map<Integer, int[]> mp = new HashMap<>();
        int mini = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (!mp.containsKey(nums[i])) {
                mp.put(nums[i], new int[]{-1, i});
            } else {
                int[] pair = mp.get(nums[i]);
                int prev = pair[0];
                int last = pair[1];

                if (prev != -1) {
                    int a = prev, b = last, c = i;
                    int diff = 2 * (c - a);
                    mini = Math.min(mini, diff);
                }

                pair[0] = last;
                pair[1] = i;
            }
        }

        return mini == Integer.MAX_VALUE ? -1 : mini;
    }
}
class Solution {
    public int minimumDistance(int[] nums) {
        int res = Integer.MAX_VALUE;

        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        for(Map.Entry<Integer, ArrayList<Integer>> entry:map.entrySet()){
            List<Integer> indices = entry.getValue();
            if (indices.size() < 3)
                continue;
            for (int i = 0; i < indices.size() - 2; i++) {
                int dist = (indices.get(i + 1) - indices.get(i)) +
                        (indices.get(i + 2) - indices.get(i + 1)) +
                        (indices.get(i + 2) - indices.get(i));
                res = Math.min(res, dist);
            }

        }
        if(res == Integer.MAX_VALUE) res = -1;
        return res;
    }
}
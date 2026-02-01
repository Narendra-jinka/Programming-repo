class Solution {
    public boolean containsDuplicate(int[] nums) {
       // HashSet<Integer> set = new HashSet<>();
       HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            // if(set.contains(i)) return true;
            // set.add(i);
            if(map.containsKey(i)) return true;
            map.put(i,0);
        }
        return false;
    }
}
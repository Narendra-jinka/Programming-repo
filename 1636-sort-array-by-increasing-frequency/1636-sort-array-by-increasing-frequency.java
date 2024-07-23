class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> arr=new ArrayList<>();
        
        for(int i:nums){
            arr.add(i);
            map.put(i,map.getOrDefault(i,0)+1);
        }
        Comparator<Integer> customComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int freq1 = map.get(o1);
                int freq2 = map.get(o2);

                if (freq1 != freq2) {
                    return Integer.compare(freq1, freq2);
                } else {
                    return Integer.compare(o2, o1);
                }
            }
        };
        Collections.sort(arr,customComparator);
        for(int i=0;i<arr.size();i++){
            nums[i]=arr.get(i);
        }
        
        return nums;
        
        
    }
}
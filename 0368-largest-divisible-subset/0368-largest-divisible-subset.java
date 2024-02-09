/*class Solution {
    public List<Integer> largestDivisibleSubset(int[] n) {
        int len = n.length;
        if(len == 0)
            return new ArrayList();
        
        List<ArrayList> resList = new ArrayList<>();
        for(int i : n)
            resList.add(new ArrayList());
        
        Arrays.sort(n);
        
        for (int i = 0; i < len; i++){
            List<Integer> max = new ArrayList<>();
            for (int j = 0; j < i; j++)
                if(n[i] % n[j] == 0 && resList.get(j).size() > max.size())
                    max = resList.get(j);
                
            resList.get(i).addAll(max);
            resList.get(i).add(n[i]);
        }
        
        
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < len; i++){
            if(resList.get(i).size() > res.size())
                res = resList.get(i);
        }
        
        return res;
    }
}
*/
class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        if (nums.length == 1) {
            return Collections.singletonList(nums[0]);
        }

        HashMap<Integer, Integer> subsetSizes = new HashMap<>();
        int maxSubsetSize = 1;
        int maxSubsetEnd = nums[0];

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            subsetSizes.put(nums[i], 1);

            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && subsetSizes.get(nums[j]) + 1 > subsetSizes.get(nums[i])) {
                    subsetSizes.put(nums[i], subsetSizes.get(nums[j]) + 1);

                    if (subsetSizes.get(nums[i]) > maxSubsetSize) {
                        maxSubsetSize = subsetSizes.get(nums[i]);
                        maxSubsetEnd = nums[i];
                    }
                }
            }
        }

        List<Integer> largestSubset = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0 && maxSubsetSize > 0; i--) {
            if (maxSubsetEnd % nums[i] == 0 && subsetSizes.get(nums[i]) == maxSubsetSize) {
                largestSubset.add(nums[i]);
                maxSubsetEnd = nums[i];
                maxSubsetSize--;
            }
        }

        return largestSubset;
    }
}












/*class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        if(nums.length==1){
            ArrayList<Integer> arr=new ArrayList<>();
            arr.add(nums[0]);
            return arr;
        }
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length-1;i++){
            List<Integer> arr =new ArrayList<>();
            arr.add(nums[i]);
            map.put(nums[i],arr);
            for(int j=i+1;j<nums.length;j++ ){
                if(helper(nums[j],map.get(nums[i]))){
                    map.get(nums[i]).add(nums[j]);
                }
            }
        }
            int max=Integer.MIN_VALUE;
            int key=-1;
            for(Map.Entry<Integer,List<Integer>> e:map.entrySet()){
                if(e.getValue().size() >=max){
                    max=e.getValue().size();
                    key=e.getKey();
                }
                
            }
            return map.get(key);
    }
    public boolean helper(int n,List<Integer> res){
        for(int i=0;i<res.size();i++){
            if(res.get(i) % n !=0 && n % res.get(i) !=0 ){
                return false;
            }
        }
        return true;
    }
    
}
List<Integer> res=new ArrayList<>();
        Arrays.sort(nums);
        if(nums[0]==1){
            res.add(1);
        }
        
        for(int i=0;i<nums.length;i++){
            if(helper(nums[i],res)){
               res.add(nums[i]); 
            }
        }
        return res;
        
        
    */
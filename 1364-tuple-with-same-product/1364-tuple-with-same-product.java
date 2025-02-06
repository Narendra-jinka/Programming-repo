class Solution {

    public int cal(int val){
        return (val*(val-1))/2;
    }
    public int tupleSameProduct(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                map.put(nums[i]*nums[j],map.getOrDefault(nums[i]*nums[j],0)+1);
            }
        }
        

        int res=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            int val = e.getValue();
            res+= (8 * cal(val));
        }
        return res;
    }
}